// Write a java program that takes an integer that takes a parameter that throws an exception if the number is odd.

import java.util.Scanner;

class ExceptionOdd{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a number that is not odd");
    
    int num = Integer.parseInt(in.nextLine());
    in.close();

    if(num % 2 != 0) {
      throw new IllegalArgumentException("Number is odd");
    }
    
    int inv = 0;
    if (num < 0) {
      num *= -1;
      inv = -1; // update inv if num is negative
    }

    if (num % 2 != 0) {
      throw new IllegalArgumentException("Number is odd");
    }
    if (inv == -1) { // check if inv is -1
      num *= -1;
    }
    System.out.printf("Good, %d is not an odd number", num);
  }
}