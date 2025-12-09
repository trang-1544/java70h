package day1;

public class Student {
    //1. Thuoc tinh
    private int id;
    private String name;
    private int age;
    //2. Cónstructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // 1. Tạo một đối tượng Student sử dụng Constructor
        System.out.println("--- Tạo Student bằng Constructor ---");
        Student student1 = new Student(101, "Nguyen Thi A", 20);

        // 2. In thông tin của student1 sử dụng các phương thức Getter
        System.out.println("Thông tin Student 1:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("----------------------------------");

        // 3. Tạo một đối tượng Student khác (có thể dùng constructor rỗng nếu có, nhưng ở đây ta dùng constructor đã định nghĩa)
        // Sau đó thay đổi thông tin bằng Setter
        System.out.println("\n--- Tạo Student và thay đổi bằng Setter ---");
        Student student2 = new Student(102, "Tran Van B", 22); // Khởi tạo ban đầu
        System.out.println("Thông tin Student 2 ban đầu:");
        student2.displayStudentInfo(); // Sử dụng phương thức displayStudentInfo() nếu có

        // Thay đổi tên và tuổi của student2 bằng Setter
        System.out.println("\nThay đổi thông tin Student 2:");
        student2.setName("Tran Thi C");
        student2.setAge(21);

        // In thông tin sau khi thay đổi bằng Getter hoặc phương thức displayStudentInfo()
        System.out.println("Thông tin Student 2 sau khi thay đổi:");
        System.out.println("ID: " + student2.getId());
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());

        // Hoặc đơn giản hơn nếu bạn đã có phương thức displayStudentInfo() trong class Student:
        System.out.println("\n--- Sử dụng displayStudentInfo() ---");
        Student student3 = new Student(103, "Le Van D", 19);
        System.out.println("Thông tin Student 3:");
        student3.displayStudentInfo();
    }
}
