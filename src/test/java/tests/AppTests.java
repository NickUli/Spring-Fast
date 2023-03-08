package tests;

import config.ProjectConfig;
import main.Parrot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that Parrot instance named parrot1 has the name Koko.")
    public void testKokoIsInTheSpringContext() {
        Parrot parrot = context.getBean("parrot1", Parrot.class);

        String actual = parrot.getName();
        String expected = "Koko";

        then(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test that Parrot instance named miki has the name Miki.")
    public void testParrotMikiHasTheNameMiki() {
        Parrot parrot = context.getBean("miki", Parrot.class);

        String actual = parrot.getName();
        String expected = "Miki";

        then(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test that Parrot instance named parrot3 has the name Riki.")
    public void testParrot3HasTheNameRiki() {
        Parrot parrot = context.getBean("parrot3", Parrot.class);

        String actual = parrot.getName();
        String expected = "Riki";

        then(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test that the String 'hello' " +
            "has been added to the Spring context.")
    public void testHelloIsInTheSpringContext() {
        String actual = context.getBean(String.class);
        String expected = "Hello";

        then(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test that the Integer 10 " +
            "has been added to the Spring context.")
    public void test10IsInTheSpringContext() {
        Integer actual = context.getBean(Integer.class);
        Integer expected = 10;

        then(actual).isEqualTo(expected);
    }
}
