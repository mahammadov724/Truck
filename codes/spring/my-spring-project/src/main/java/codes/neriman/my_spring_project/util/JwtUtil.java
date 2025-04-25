package codes.neriman.my_spring_project.util;
	

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtUtil {
	
	private final Key signingKey;
	
	private JwtUtil(@Value("${jwt.secret}") String secretKey) {
		byte[] decode = Base64.getDecoder().decode(secretKey);
		this.signingKey = Keys.hmacShaKeyFor(decode);
	}
	
	public String generateToken(String username) {
		return Jwts.builder()
		.setSubject(username)
		.setIssuedAt(new Date())
		.setExpiration(new Date(System
		.currentTimeMillis()+ 86400000))
		.signWith(signingKey)
		.compact();
	}
	
	public String extractUsername(String token) {
		Claims claims = Jwts.parserBuilder()
		.setSigningKey(signingKey)
		.build()
		.parseClaimsJws(token)
		.getBody();
		
		return claims.getSubject();
	}
}
