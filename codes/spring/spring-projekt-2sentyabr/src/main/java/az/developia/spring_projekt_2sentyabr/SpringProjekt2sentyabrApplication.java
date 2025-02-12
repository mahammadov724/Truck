package az.developia.spring_projekt_2sentyabr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjekt2sentyabrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjekt2sentyabrApplication.class, args);
		BeanFactory run = null;
		Book bean = run.getBean(Book.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getPrice());
		System.out.println(bean.getPageCount());
	}
	
	
}
