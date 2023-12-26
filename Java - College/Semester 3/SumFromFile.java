// Write a program that reads data from a text file and calculates the sum of numbers. Handle file-related exceptions.
public class SumFromFile {
  public static void main(String[] args) {
    try {
      java.io.File file = new java.io.File("numbers.txt");
      java.util.Scanner input = new java.util.Scanner(file);
      int sum = 0;
      while (input.hasNext()) {
        sum += input.nextInt();
      }
      System.out.println("The sum of the numbers in the file is " + sum);
      input.close();
    } catch (java.io.FileNotFoundException ex) {
      System.out.println("File not found..\nPlease Create a file named \"numbers.txt\" and put some numbers in it.");
    }
  }
}