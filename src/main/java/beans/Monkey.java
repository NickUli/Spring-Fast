package beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Monkey {

    String name;

    public Monkey() {
        System.out.println("Create unknown monkey");
        setName("Unknown");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Set monkey name as " + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monkey: " + name;
    }
}
