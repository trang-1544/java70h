package oop.interface_1.shape;

public class Square implements Shape{
    double canhHV ;
    @Override
    public double area() {
        return canhHV* canhHV ;
    }
}
