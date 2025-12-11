package collection.list;

import java.util.ArrayList;
import java.util.HashMap;

/*Bài 2 (Trung bình):

Cho danh sách tên sinh viên: ["Lan", "Hoa", "Lan", "Minh", "Kien"]

Yêu cầu:

Lưu vào ArrayList

Đếm xem mỗi tên xuất hiện bao nhiêu lần (gợi ý: duyệt list và dùng biến đếm)

Output mong muốn:

Lan: 2 Hoa: 1 Minh: 1 Kien: 1
 */
public class bai2_demphantu {
    public static void main(String[] args) {
ArrayList<String> SinhVien = new ArrayList<>();
SinhVien.add("Lan");
SinhVien.add("Hoa");
SinhVien.add("Lan");
SinhVien.add("Minh");
SinhVien.add("Kien");
        HashMap<String, Integer> countMap = new HashMap<>();

        // Bước 3: Duyệt list và cập nhật số lần
        for(String name:SinhVien){
            if(countMap.containsKey(name)){
                countMap.put(name,countMap.get(name)+1);
            }else {
                countMap.put(name,1);
            }
        }
        // Bước 4: In kết quả
        for(String key: countMap.keySet()){
            System.out.println(key+" :"+ countMap.get(key));
        }
    }
}


