package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        System.out.println("Create bin parrot1 and set name Koko");
        return parrot;
    }

    @Bean (name = "miki")
    Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        System.out.println("Create bin parrot2 width name bin miki and set name Miki");
        return parrot;
    }

    @Bean
    @Primary
    Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName("Riki");
        System.out.println("Create primary bin parrot3 and set name Riki");
        return parrot;
    }

    @Bean
    String hello() {
        System.out.println("Create String hello");
        return "Hello";
    }

    @Bean
    Integer ten() {
        System.out.println("Create Integer 10");
        return 10;
    }
}
