package oop.interface_1.Animals;

public class Dog implements Animals{
    @Override
    public void eat() {
        System.out.println("Xương");
    }

    @Override
    public void sound() {
        System.out.println("Gâu");
    }
}
