
// Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Before removing: " + numbers);

        // Remove the third element
        numbers.remove(2); // Index starts from 0, so index 2 is the third element

        System.out.println("After removing: " + numbers);
    }
}