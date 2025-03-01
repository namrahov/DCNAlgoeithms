package leeetcode.array;

import java.util.LinkedList;
import java.util.Queue;

public class MainArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        System.out.println(findSingleNumber(arr));
    }

    public static int findSingleNumber(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for (int element : nums) {
            if (queue.contains(element)) {
                queue.remove(element);
            } else {
                queue.add(element);
            }
        }

        return queue.peek();
    }

}
