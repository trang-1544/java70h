package day1;

public class HocSinh {
//1. Thuoc tinh
    private int id;
    private String name ;
    private int age ;
    private double score;
    //2. Ham Constructor
    public HocSinh(int id,String name,int age, double score){
        this.id =id;
        this.age = age;
        this.score =score;
        this.name = name ;
    }
    // 3. Các phương thức Getter (để lấy giá trị thuộc tính)
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 4. Các phương thức Setter (để thiết lập giá trị thuộc tính)
    // Setter cho phép bạn thay đổi giá trị của thuộc tính sau khi đối tượng đã được tạo
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayStudentInfo() {
        System.out.println("Thông tin HS");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
