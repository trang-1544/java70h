package oop.level_2_copy;

import java.util.ArrayList;

public class quanlysinhvien_a {
    ArrayList<hs_a> danhsach = new ArrayList<>();
    // them sinh vien
    public void add_hs(hs_a hs){
        danhsach.add(hs);
    }
    public void IndanhSach(){
        for(hs_a hs: danhsach){
            System.out.println(hs);
        }
    }


}
