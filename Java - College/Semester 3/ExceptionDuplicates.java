node
// Write a java program that reads a list of integers from the user and throws an exception if any of the numbers are duplicates.
import java.util.Scanner;
import java.util.HashSet;

public class ExceptionDuplicates {

  static void checkDuplicates(int[] arr) throws Exception {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
      if (!set.add(num)) {
        throw new Exception("Duplicate number found: " + num);
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    try {
      checkDuplicates(arr);
      System.out.println("No duplicates found.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    input.close();
  }
}