import java.util.ArrayList;

public class ArrayListManipulation {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i + 1);
        }

        // Print the ArrayList before insertion
        System.out.println("ArrayList before insertion: " + arrayList);

        // Get the insertion position and new value
        int position = 2;
        int newValue = 10;

        // Check if the insertion position is valid
        if (position < 0 || position > arrayList.size()) {
            System.out.println("Invalid insertion position!");
            return;
        }

        // Insert the new value at the specified position
        arrayList.add(position, newValue);

        // Print the ArrayList after insertion
        System.out.println("ArrayList after insertion: " + arrayList);
    }
}
