// Define a class "Student" with attributes such as name, roll number, and age. Create instances of the class and display their information.
import java.util.Scanner;

class Student {
    String name;
    int roll;
    int age;

    Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the total number of Students");
        int numOfStudents = s.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i = 0;i<numOfStudents; i++){
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = s.nextLine();
            System.out.print("Roll: ");
            int roll = s.nextInt();
            System.out.print("Age: ");
            int age = s.nextInt();
            s.nextLine();

            students[i] = new Student(name, roll, age);
        }
        
        for(int i=0; i< numOfStudents; i++){
            students[i].display();
        }
        s.close();
    }
}