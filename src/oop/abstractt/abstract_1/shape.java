package oop.abstractt.abstract_1;
/*
Bài 1 — Shape

Tạo abstract class Shape:

Method abstract double area()

Tạo class Circle:

Thuộc tính radius

Override area()

👉 main: tạo object Circle, in diện tích
 */
abstract class shape {
    // Java hiểu là default access modifier
    //(tức là package-private)
    // chua co cach tinh
    abstract double area();

}
