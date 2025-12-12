package oop.basic.HS_level_1_a;

public class hs {
    private String maSV;
    private String FullName;
    private String NamSinh;
    private String major;
    private double diem1;
    private double diem2;

    public hs(String maSV, String fullName, String namSinh, String major, double diem1, double diem2) {
        this.maSV = maSV;
        FullName = fullName;
        NamSinh = namSinh;
        this.major = major;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public String toString() {
        return "hs{" +
                "maSV='" + maSV + '\'' +
                ", FullName='" + FullName + '\'' +
                ", NamSinh='" + NamSinh + '\'' +
                ", major='" + major + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                '}';
    }

    public double tongdiem() {
        return diem1 + diem2;
    }


}
