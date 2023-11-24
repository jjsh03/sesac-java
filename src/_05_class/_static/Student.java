package _05_class._static;

public class Student {
    private String name;
    private int student_ID;
    private int grade;
    private static int totalStudents = 0;

    public Student(String name, int student_ID, int grade) {
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudents++;
    }


    public static int getTotalStudents() {
        return totalStudents;
    }

    public void displayInfo() {
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("학번: " + student_ID);
        System.out.println("학년: " + grade);
    }
}
