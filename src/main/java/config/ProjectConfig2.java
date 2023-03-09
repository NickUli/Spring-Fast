package config;

import beans.Monkey;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig2 {

    @Bean
    public Monkey abu() {
        System.out.println("Create bin monkey {START");
        Monkey monkey = new Monkey();
        monkey.setName("Abu");
        System.out.println("END}");
        return monkey;
    }

    @Bean
    public Person alibaba(Monkey abu) {
        System.out.println("Create bin person {START");
        Person person = new Person();
        person.setName("Alibaba");
        person.setMonkey(abu);
        System.out.println("END}");
        return person;
    }
}
