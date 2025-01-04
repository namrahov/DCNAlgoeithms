package array.sumtwoparis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPairsSumMain {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 9, 11};
        int target = 9;

        System.out.println(twoParisSum(arr, target));
    }

    public static List<Integer> twoParisSum(int[] arr, int target) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                res.add(map.get(target - arr[i]));
            }
        }

        return res;
    }
}
