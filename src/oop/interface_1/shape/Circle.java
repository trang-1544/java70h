package oop.interface_1.shape;

public class Circle implements Shape{
    double radius ;
    // constructor
    public Circle(double radius){
        this.radius = radius ;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
