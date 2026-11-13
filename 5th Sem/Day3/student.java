/*Write a java program to create a Student Class with proper attributes like roll no, name, stream, and college.
Craete two insatanes of that class from main (declared in diffrent classes) and print them*/
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String stream;
    private String college;

    public Student(int rollNo, String name, String stream, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.stream = stream;
        this.college = college;
    }

    public void printStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Stream: " + stream);
        System.out.println("College: " + college);
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student(1, "Alice", "Computer Science", "XYZ College");
        Student student2 = new Student(2, "Bob", "Mechanical Engineering", "ABC College");

        System.out.println("Student 1:");
        student1.printStudentInfo();

        System.out.println("\nStudent 2:");
        student2.printStudentInfo();

        sc.close();
    }
}