package oop.abstractt.abstract_1;

 class circle extends shape {
     double r ;
     circle(double r) {
         this.r = r;
     }
// tu dua ra cach tinh
     @Override
     double area() {
         return Math.PI*r*r;
     }
 }
