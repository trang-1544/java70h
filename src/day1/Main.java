package day1;

public class Main {
    public static void main(String[] args) {
        //1. Lay gia tri thuoc tinh sv dung get
        //2. Thay doi gia tri thuoc tinh dung set
        //3. Lay toan bo thong tin sv
        HocSinh hs1 = new HocSinh(01,"Ngoc",22,80);
        //1. Lay gia tri thuoc tinh sv dung get
        System.out.println("Name : "+hs1.getName());
        //2. Thay doi gia tri thuoc tinh dung set
        //3. Lay toan bo thong tin sv
        hs1.displayStudentInfo();

    }
}
