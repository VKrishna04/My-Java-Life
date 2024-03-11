node// find common array elements

import java.util.HashSet;
import java.util.Set;

public class IntersectArray {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };

        Set<Integer> set1 = new HashSet<Integer>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<Integer>();
        for (int num : array2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        System.out.println("Common elements: " + set2);
    }
}