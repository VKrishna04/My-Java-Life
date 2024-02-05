// Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Before swapping: " + numbers);

        // Swap elements at index 1 and 3
        Collections.swap(numbers, 1, 3);

        System.out.println("After swapping: " + numbers);
    }
}