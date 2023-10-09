import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read student details
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();

        double[] subjectMarks = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjectMarks[i] = input.nextDouble();
        }

        // Calculate total, average, and percentage
        double totalMarks = calculateTotalMarks(subjectMarks);
        double averageMarks = calculateAverageMarks(totalMarks);
        double percentage = calculatePercentage(totalMarks);

        // Display student information
        displayStudentInfo(name, id, subjectMarks, totalMarks, averageMarks, percentage);

        input.close();
    }

    // Function to calculate total marks
    public static double calculateTotalMarks(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    // Function to calculate average marks
    public static double calculateAverageMarks(double totalMarks) {
        return totalMarks / 3;
    }

    // Function to calculate percentage
    public static double calculatePercentage(double totalMarks) {
        return (totalMarks / 300) * 100;
    }

    // Function to display student information
    public static void displayStudentInfo(String name, int id, double[] marks, double totalMarks, double averageMarks, double percentage) {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
