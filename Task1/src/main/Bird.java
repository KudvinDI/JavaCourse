package main;

public class Bird extends Pet {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Hello, Hello";
    }

    @Override
    public void run() {
        System.out.println("Bird is flying");
    }
}
