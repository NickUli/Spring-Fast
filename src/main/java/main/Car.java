package main;

import org.springframework.stereotype.Component;

@Component
public class Car {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
