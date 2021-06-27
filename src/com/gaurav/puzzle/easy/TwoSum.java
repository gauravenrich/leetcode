package com.gaurav.puzzle.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 17;
        int[] res = twoSum(a, target);
        System.out.println("Indexes are " + res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int index = 0;
        for (Integer cur : a) {
            int diff = target - cur;
            if (map.containsKey(diff)) {
                res[0] = map.get(diff);
                res[1] = index;
                break;
            } else {
                map.put(cur, index);
                index++;
            }
        }
        return res;
    }
}
