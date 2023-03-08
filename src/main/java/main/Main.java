package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot1 = context.getBean("parrot1", Parrot.class);
        System.out.println(parrot1.getName());

        Parrot parrot2 = context.getBean("miki", Parrot.class);
        System.out.println(parrot2.getName());

        Parrot parrot3 = context.getBean("parrot3", Parrot.class);
        System.out.println(parrot3.getName());

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        Car car = context.getBean(Car.class);
        System.out.println(car);
        System.out.println(car.getName());

        String string = context.getBean(String.class);
        System.out.println(string);

        Integer integer = context.getBean(Integer.class);
        System.out.println(integer);
    }
}
