package codes.neriman.my_spring_project.util;
	

import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Component
public class JwtUtil {
	private final Key signingKey;
	
	public JwtUtil(@Value("${jwt.secret}") String secretKey) {
		byte[] decode = Base64.getDecoder().decode(secretKey);
		this.signingKey = Keys.hmacShaKeyFor(decode);
		System.out.println(decode.length);
	}
	
	public String generateToken(String username,String firstName,List<String> authorities) {
		Map<String, String> claims = new HashMap<String, String>();
		claims.put("firstName", firstName);
		String authorityString = String.join(",", authorities);
		claims.put("authorities", authorityString);
		return Jwts.builder()
		.setClaims(claims)
		.setSubject(username)
		.setIssuedAt(new Date())
		.setExpiration(new Date(System.currentTimeMillis() + 86400000))
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
	
	public Map<String, Object> extractClaims(String token) {
 		Claims claims = Jwts.parserBuilder()
 				.setSigningKey(signingKey)
 				.build()
 				.parseClaimsJws(token)
 				.getBody();
 		
 		Map<String, Object> claimMap=new HashMap<String, Object>();
 		claimMap.put("firstName", claims.get("firstName").toString());
 		String authorities = (String) claims.get("authorities");
		if (authorities != null && !authorities.isEmpty()) {
			claimMap.put("authorities", Arrays.asList(authorities.split(",")));
		}else {
			claimMap.put("authorities", new String[] {});
		}
 		return claimMap;
 	}
}
