package oop.Animals;

public class Cat implements Animals{
    @Override
    public void eat() {
        System.out.println("pate");
    }

    @Override
    public void sound() {
        System.out.println("meomeo");
    }
}
