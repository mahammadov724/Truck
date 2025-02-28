package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public Employee myEmployee(Computer computer) { 
        Employee employee = new Employee();
        employee.setComputer(computer);
        return employee;
    }
    
    @Bean
    public RAM myRam(RAM ram) {
    	RAM ram1 = new RAM();
    	ram.setType("Ryzen");
    	ram.setSpeed(3600);
    	ram.setSize(0);
    	return ram;
    }
}
