// search an element from an array

import java.util.Scanner;

public class SearchArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      int[] array = { 1, 2, 3, 4, 5 };
      int search = input.nextInt();
      boolean found = false;
      int i = 0;
      for (; i < array.length; i++) {
        if (array[i] == search) {
          found = true;
          break;
        }
      }
      if (found) {
        System.out.println("Found at index " + i);
      } else {
        System.out.println("Not found");
      }
    } finally {
      if (input != null) {
        input.close();
      }
    }
  }
}