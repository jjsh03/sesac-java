package _05_class._static;

public class StudentEx {
    public static void main(String[] args) {
        Student student1 = new Student("김새싹", 20231001, 1);
        Student student2 = new Student("박지은", 20231002, 2);
        Student student3 = new Student("이은지", 20231003, 3);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        System.out.println();
        System.out.println("총 학생 수는 " + Student.getTotalStudents() + "명입니다.");
    }

}
