package az.developia.spring_projekt_2sentyabr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import az.developia.spring_projekt_2sentyabr.entity.Computer;
import az.developia.spring_projekt_2sentyabr.entity.Employee;

@Configuration
public class EmployeeConfig {

    @Bean(value = "myEmployee")
    public Employee myEmployee(Computer computer) { 
        Employee employee = new Employee();
        employee.setComputer(computer);
        return employee;
    }
    
}
