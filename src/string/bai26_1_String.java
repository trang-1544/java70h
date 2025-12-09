package string;

public class bai26_1_String {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder();
        // append thêm vào cối chuỗi
        chuoi.append("hello, ");
        System.out.println(chuoi);
        // insert chen chuoi vao vị trí
        chuoi.insert(2,"ABC");
        System.out.println(chuoi);
    }
}
