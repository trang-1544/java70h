package oop;

public class ThiSinh {
    //1. thuoc tính
    private String HoTen;
    private String NgaySinh ;
    private double diem1 ;
    private double diem2 ;
    // 2.Constructor
    ThiSinh(String HoTen, String NgaySinh, double diem1,double diem2){
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    // 4.method
    public double Tinhtongdiem(){
        return diem1 +diem2;
    }
    public void HienInfor(){
       // ko dung println
        System.out.printf("%s %s %.1f",HoTen,NgaySinh,Tinhtongdiem());
    }
    public String getHoTen(){
        return this.HoTen ;
    }
    public double getdiem1(){
        return this.diem1 ;
    }
    public void setDiem1(double diem1){
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "HoTen='" + HoTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                '}';
    }
}
