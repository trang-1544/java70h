package oop.level_2_copy;

public class hs_a {
    private String maSV;
    private String fullName;
    private String namSinh;
    private String major;
    private double diem1;
    private double diem2;

    public hs_a(String maSV, String fullName, String namSinh, String major, double diem1, double diem2) {
        this.maSV = maSV;
        this.fullName = fullName;
        this.namSinh = namSinh;
        this.major = major;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    @Override
    public String toString() {
        return "hs_a{" +
                "maSV='" + maSV + '\'' +
                ", fullName='" + fullName + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", major='" + major + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                '}';
    }
}
