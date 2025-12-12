package oop.basic.level2;

public class hs {
    private String maSV;
    private String fullName;
    private String namSinh;
    private String major;
    private double diem1;
    private double diem2;

    public hs(String maSV, String fullName, String namSinh,
              String major, double diem1, double diem2) {
        this.maSV = maSV;
        this.fullName = fullName;
        this.namSinh = namSinh;
        this.major = major;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public String getMaSV() {
        return maSV;
    }

    public double tongDiem() {
        return diem1 + diem2;
    }

    public String xepLoai() {
        if (tongDiem() < 10) return "Yeu";
        else if (tongDiem() < 15) return "TB";
        else return "Gioi";
    }

    @Override
    public String toString() {
        return "hs{" +
                "maSV='" + maSV + '\'' +
                ", fullName='" + fullName + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", major='" + major + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", xepLoai='" + xepLoai() + '\'' +
                '}';
    }
}


