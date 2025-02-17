package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean
    @Primary
    public Computer myComp2(RAM ram) {
        Computer c = new Computer();
        c.setId(123);
        c.setBrand("MSI");
        c.setPrice(700.00);
        return c;
    }

    @Bean
    public RAM myRam() { 
        return new RAM();
    }
}
