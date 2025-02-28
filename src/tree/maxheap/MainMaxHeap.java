package tree.maxheap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MainMaxHeap {

    public static void main(String[] args) {
        int[] arr = {7, 1, 10, 4, 2, 90, 45};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }
        System.out.println(maxHeap);
        for (int i = 0; i < 5; i++) {
            maxHeap.poll();
        }


    }
}
