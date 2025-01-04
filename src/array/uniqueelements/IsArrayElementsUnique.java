package array.uniqueelements;

import java.util.HashSet;
import java.util.Set;

public class IsArrayElementsUnique {
    public static void main(String[] args) {
        int[] arr = { 11, 3, 13, 14, 4, 25, 7, 22, 9, 10 };
        System.out.println(isUnique(arr));
    }

    public static boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.contains(j)) {
                set.add(j);
            } else {
                return false;
            }
        }

        return true;
    }
}
