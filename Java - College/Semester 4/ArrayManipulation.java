import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int position = 2;
        int newValue = 10;

        if (position < 0 || position > array.length) {
            System.out.println("Invalid insertion position!");
            return;
        }

        int newArraySize = array.length + 1;
        int[] newArray = new int[newArraySize];

        System.arraycopy(array, 0, newArray, 0, position);

        newArray[position] = newValue;

        System.arraycopy(array, position, newArray, position + 1, array.length - position);

        // array = newArray; 

        System.out.println(Arrays.toString(newArray)); 
    }
}