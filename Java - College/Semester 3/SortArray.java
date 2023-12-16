
// sort an array in descending and ascending order
import java.util.Scanner;

public class SortArray {
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the size of array.");
    int n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
      input.nextLine(); // consume the leftover newline
    }
    System.out.println("The array before sorting");
    System.out.println(array);
    // bubble sort
    bubble(array);

    System.out.println("The array after sorting");
    System.out.println(array);
    input.close();
  }

  static void bubble(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j] = temp;
        }
      }
    }
  }
}
