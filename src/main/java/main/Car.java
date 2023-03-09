package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Car {

    String name;

    public Car() {
        System.out.println("Create obj Car");
    }

    @PostConstruct
    public void init() {
        this.name = "Fiat";
        System.out.println("Run post construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
