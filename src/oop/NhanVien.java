package oop;

public abstract class NhanVien {
    protected String ten ;
    protected int age ;
    protected double luongcb = 8500;

    public NhanVien(String ten, int age) {
        this.ten = ten;
        this.age = age;
    }
    public double Tinhluong(){
        return this.luongcb;
    }
}
