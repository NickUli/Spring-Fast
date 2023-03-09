package main;

import beans.Monkey;
import beans.Person;
import config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Person person = context.getBean(Person.class);
        Monkey monkey = context.getBean(Monkey.class);

        System.out.println("Person`s name: " + person.getName());
        System.out.println("Monkey`s name: " + monkey.getName());
        System.out.println("Person`s monkey: " + person.getMonkey());
    }
}
