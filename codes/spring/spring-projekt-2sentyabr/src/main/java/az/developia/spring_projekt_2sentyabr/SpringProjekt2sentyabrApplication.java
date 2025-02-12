package az.developia.spring_projekt_2sentyabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjekt2sentyabrApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringProjekt2sentyabrApplication.class, args);
		Book bean = run.getBean(Book.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getPrice());
		System.out.println(bean.getPageCount());
	}
	
	
}
