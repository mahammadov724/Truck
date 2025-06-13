package codes.neriman.my_spring_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringProjectApplication {
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper m = new ModelMapper();
		return m;
	}

	public static void main(String[] args) {
		SpringApplication.run(MySpringProjectApplication.class, args);
	}

}
