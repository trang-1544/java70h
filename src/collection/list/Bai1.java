/*Bài 1 (Dễ):

Viết chương trình:

Tạo ArrayList<Integer>

Thêm các số: 5, 1, 9, 1, 3

In ra danh sách

In ra phần tử ở index 2

Xóa phần tử ở index 1

In lại danh sách sau khi xóa*/
package collection.list;
import java.util.ArrayList;
public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> Abc = new ArrayList<Integer>();
        Abc.add(5);
        Abc.add(1);
        Abc.add(9);
        Abc.add(1);
        Abc.add(3);
        System.out.println(Abc.get(1));
        Abc.remove(1);
        for(Integer i:Abc){
            System.out.println(i);
        }
        Abc.remove(1);


    }
}
