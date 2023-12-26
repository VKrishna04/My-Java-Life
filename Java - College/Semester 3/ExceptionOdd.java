// Write a java program that takes an integer that takes a parameter that throws an exception if the number is odd.

import java.util.Scanner;
import java.lang.Math;

class ExceptionOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a number that is not odd");

    int num = Integer.parseInt(in.nextLine());
    in.close();

    if (Math.abs(num) % 2 != 0) {
      throw new IllegalArgumentException("Number is odd");
    }

    System.out.printf("Good, %d is not an odd number", num);
  }
}