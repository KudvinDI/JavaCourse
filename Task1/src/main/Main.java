package main;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Dog dog = new Dog("Snow");
        System.out.println(dog.voice());
        dog.run();
        Cat cat = new Cat("Luna");
        System.out.println(cat.voice());
        cat.run();
        Bird bird = new Bird("Scruffy");
        System.out.println(bird.voice());
        bird.run();

    }
}
