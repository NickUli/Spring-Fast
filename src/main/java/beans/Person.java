package beans;

public class Person {

    String name;
    Monkey monkey;

    public Person() {
        System.out.println("Create unknown person");
        setName("Unknown");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Set person name as " + name);
        this.name = name;
    }

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        System.out.println("Set persons monkey is " + monkey.getName());
        this.monkey = monkey;
    }
}
