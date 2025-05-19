package codes.neriman.my_spring_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

public class SwaggerConfig {
	@Configuration
	@SecurityScheme(
			name = "bearerAuth",
			description = "JWT auth description",
			scheme = "bearer",
			bearerFormat = "JWT",
			type = SecuritySchemeType.HTTP,
			in = SecuritySchemeIn.HEADER
			
			)
		@Bean
		public OpenAPI customOpenApi() {
			return new OpenAPI()
					.info(new Info()
							.title("Movie API")
							.version("1.0.0")
							.description("Movie api leri ucun documentasiya.."));
		}
}
