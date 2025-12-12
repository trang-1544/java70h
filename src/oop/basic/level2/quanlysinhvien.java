package oop.basic.level2;

import java.util.ArrayList;

public class quanlysinhvien {
    // Danh sách sinh viên
    private ArrayList<hs> danhSach = new ArrayList<>();

    // Thêm sinh viên
    public void addSV(hs sv) {
        danhSach.add(sv);
    }

    // Hiển thị danh sách sinh viên
    public void showInfor() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (hs sv : danhSach) {
            System.out.println(sv);
        }
    }

    // Tìm sinh viên theo mã
    public void timTheoMa(String ma) {
        boolean found = false;
        for (hs sv : danhSach) {
            if (sv.getMaSV().equals(ma)) {
                System.out.println("Tim thay:");
                System.out.println(sv);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ma: " + ma);
        }
    }
}


