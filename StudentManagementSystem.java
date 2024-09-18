
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student id -> " + id + "\n Student name -> " + name + "\n Student age -> " + age;
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("------Student Management System------");
            System.out.println("1. Add Student");
            System.out.println("2. View all Students");
            System.out.println("3. Delete Students");
            System.out.println("4. Exist");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> deleteStudent();
                case 4 -> {
                    System.out.println("Existing.....");
                    System.exit(0);
                }
                default -> System.out.println("Invalid! Choice Please try again!");
            }

        }

    }

    // add student
    public static void addStudent() {
        System.out.print("Enter Student id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student age: ");
        int age = scanner.nextInt();

        Student student = new Student(id, name, age);
        students.add(student);
        System.out.println("******Student Added Successfully!******");
    }

    // view All students
    public static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No Student found!");
        } else {
            System.out.println("//////////List of Students:-//////////");
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println("///////////////////////////////////////");
        }

    }

    // delete student
    public static void deleteStudent() {
        System.out.print("Enter Student id to delete: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.id == id) {
                students.remove(student);
                System.out.println("******Student Removed Successfully!******");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with id " + id + " not found");
        }
    }

}
