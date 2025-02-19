package az.developia.spring_projekt_2sentyabr.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Computer1 {
	public Computer1() {
        System.out.println("Computer1");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
