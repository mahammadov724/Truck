package az.developia.spring_projekt_2sentyabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_projekt_2sentyabr.entity.Book;
import az.developia.spring_projekt_2sentyabr.entity.Computer;

@SpringBootApplication
public class SpringProjekt2sentyabrApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringProjekt2sentyabrApplication.class, args);
		Computer bean = run.getBean(Computer.class);
		System.out.println(bean);
	}
	
	
}
