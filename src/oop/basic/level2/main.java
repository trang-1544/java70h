package oop.basic.level2;

public class main {
    public static void main(String[] args) {
        quanlysinhvien qlsv = new quanlysinhvien();

        hs hs1 = new hs("001", "Hoa", "2002", "IT", 8, 7);
        hs hs2 = new hs("002", "Linh", "2003", "HTTT", 9, 8);
        hs hs3 = new hs("003", "Nam", "2001", "SE", 6, 5);

        qlsv.addSV(hs1);
        qlsv.addSV(hs2);
        qlsv.addSV(hs3);

        System.out.println("=== DANH SACH SINH VIEN ===");
        qlsv.showInfor();

        System.out.println("=== TIM SINH VIEN MA 002 ===");
        qlsv.timTheoMa("002");
    }
    }

