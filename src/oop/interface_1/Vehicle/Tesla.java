package oop.interface_1.Vehicle;

public class Tesla implements Car{
    @Override
    public void start() {
        System.out.println("Khoi dong bang dien");
    }

    @Override
    public void drive() {
        System.out.println("Tesla dang lai");
    }
}
