package az.developia.spring_projekt_2sentyabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_projekt_2sentyabr.entity.Computer;
import az.developia.spring_projekt_2sentyabr.entity.Employee;
import az.developia.spring_projekt_2sentyabr.entity.Home;

@SpringBootApplication
public class SpringProjekt2sentyabrApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringProjekt2sentyabrApplication.class, args);
        
        Employee employee = run.getBean(Employee.class);
        System.out.println(employee);
        
        Computer computer = run.getBean(Computer.class);
        System.out.println(computer);
        
        Home home1 = run.getBean(Home.class);
        System.out.println(home1); 

        Home home2 = run.getBean(Home.class);
        System.out.println(home2);  
        
    }
}
