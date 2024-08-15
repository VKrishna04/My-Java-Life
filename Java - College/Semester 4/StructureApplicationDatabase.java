import java.util.Scanner;

// Define a class to represent a student
class Student {
    String name;
    int rollNumber;
    float marks;
}

// Studentinfo class
public class StructureApplicationDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Declare an array of objects to store student information
        Student[] students = new Student[numStudents];

        // Input information for each student
        for (int i = 0; i < numStudents; ++i) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            // Input name
            System.out.print("Enter name: ");
            students[i] = new Student();
            students[i].name = scanner.next();

            // Input roll number
            System.out.print("Enter roll number: ");
            students[i].rollNumber = scanner.nextInt();

            // Input marks
            System.out.print("Enter marks: ");
            students[i].marks = scanner.nextFloat();
        }
        scanner.close();

        // Calculate the average marks for the class
        float totalMarks = 0;
        for (int i = 0; i < numStudents; ++i) {
            totalMarks += students[i].marks;
        }

        float averageMarks = totalMarks / numStudents;

        // Display the average marks for the class
        System.out.println("\nAverage marks for the class: " + String.format("%.2f", averageMarks));

        // Display information for each student
        System.out.println("\nStudent details:");
        for (int i = 0; i < numStudents; ++i) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Name: " + students[i].name);
            System.out.println("Roll number: " + students[i].rollNumber);
            System.out.println("Marks: " + students[i].marks);
        }
    }
}