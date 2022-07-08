package main;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Woof";
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
