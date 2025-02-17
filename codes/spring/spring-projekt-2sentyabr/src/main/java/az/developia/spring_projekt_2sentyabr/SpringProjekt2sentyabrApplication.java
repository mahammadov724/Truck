package az.developia.spring_projekt_2sentyabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_projekt_2sentyabr.entity.Employee;

@SpringBootApplication
public class SpringProjekt2sentyabrApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringProjekt2sentyabrApplication.class, args);
        
        Employee employee = run.getBean(Employee.class);
        System.out.println(employee);
    }
}
