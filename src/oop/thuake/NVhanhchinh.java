package oop.thuake;
public class NVhanhchinh extends NhanVien {
    protected int ca ;
    public NVhanhchinh(String ten, int age, int ca) {
        super(ten,age);
        this.ca = ca ;
    }

    @Override
    public double Tinhluong() {
       return  luongcb*1.2;
    }

}
