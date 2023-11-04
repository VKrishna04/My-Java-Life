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
    System.in.read();
    int[] arr;
    int[] arr2;
    


    try {
      checkDuplicates(arr);
      checkDuplicates(arr2);
    } catch (Exception e) {
      System.err.println(e);
    }
    input.close();
  }
}
