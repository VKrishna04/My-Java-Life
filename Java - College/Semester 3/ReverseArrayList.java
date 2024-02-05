
// Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Before reversing: " + numbers);

        Collections.reverse(numbers);

        System.out.println("After reversing: " + numbers);
    }
}