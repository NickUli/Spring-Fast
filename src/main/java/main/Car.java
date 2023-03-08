package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Car {

    String name;

    @PostConstruct
    public void init() {
        this.name = "Fiat";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
