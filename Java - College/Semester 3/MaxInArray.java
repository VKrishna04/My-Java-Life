node// finding the largest element in an array

import java.util.Scanner;

public class MaxInArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the size of array.");
    int n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
      input.nextLine(); // consume the leftover newline
    }

    int largest = array[0];

    for (int i = 0; i < n; i++) {
      if (largest < array[i]) {
        largest = array[i];
        break;
      }
    }
    System.out.println(largest);
    input.close();
  }
}
