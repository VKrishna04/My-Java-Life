
// Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.List;

public class InsertArrayList {
  public static void main(String[] args) {
    // Create an ArrayList
    List<String> list = new ArrayList<>();

    // Add elements to the ArrayList
    list.add("Element 1");
    list.add("Element 2");
    list.add("Element 3");

    // Insert an element at the first position
    list.add(0, "Element 0");

    // Print the ArrayList
    System.out.println(list);
  }
}
