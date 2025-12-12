/*LEVEL 1 – OOP CƠ BẢN (BẮT BUỘC)
Kiến thức dùng

class, object

constructor

this

method

Yêu cầu

Tạo class SinhVien gồm:

maSV, hoTen, tuoi, diemTB

constructor

in thông tin

xếp loại học lực

 */
package oop.basic.HS_lv1_get_set;

public class main {
    public static void main(String[] args) {
        hs hs2 = new hs("002","hoa","002","httt",9,7);
        hs2.getDiem1();
        hs2.setFullName("linh");
        System.out.println(hs2.toString());
        System.out.println(hs2.XepLoai());
    }
}
