package oop.interface_1.product;

public class Product {
    private String tenSP;
    private double price ;
    private int quanity ;

    public Product(String tenSP, double price, int quanity) {
        this.tenSP = tenSP;
        this.price = price;
        this.quanity = quanity;
    }
    public double TinhTien(){
        return price*quanity ;
    }
}
