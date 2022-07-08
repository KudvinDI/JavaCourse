package main;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Meow";
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
