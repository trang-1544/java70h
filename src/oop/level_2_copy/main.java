package oop.level_2_copy;

public class main {
    public static void main(String[] args) {
        quanlysinhvien_a qlsv1 = new quanlysinhvien_a();
        System.out.println("=== DANH SACH SINH VIEN ===");
        hs_a hs1 = new hs_a("002","Ngoc","009","httt",6,9);
        hs_a hs2 = new hs_a("009","Linh","009","httt",6,9);
        hs_a hs3 = new hs_a("006","An","009","httt",6,9);
        // Khi in một object bằng System.out.println(object)
        //Java sẽ tự động gọi object.toString()
        qlsv1.add_hs(hs1);
        qlsv1.add_hs(hs2);
        qlsv1.add_hs(hs3);
        qlsv1.IndanhSach();

    }
}
