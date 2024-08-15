
// Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;
import java.util.List;

public class GetElementArrayList {
  public static void main(String[] args) {
    // Create an ArrayList
    List<String> list = new ArrayList<>();

    // Add elements to the ArrayList
    list.add("Element 1");
    list.add("Element 2");
    list.add("Element 3");

    // Retrieve an element at a specified index
    String element = list.get(1); // This will get the second element (index starts from 0)

    // Print the element
    System.out.println("Element at index 1: " + element);
  }
}