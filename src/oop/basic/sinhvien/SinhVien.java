package oop.basic.sinhvien;

public class SinhVien {
    private  String TenSV;
    private  int age ;
    SinhVien(String TenSV,int age){
        this.TenSV = TenSV;
        this.age = age ;
    }
    void ShowInfor(){
        System.out.println(TenSV+ " "+ age);
    }
}
