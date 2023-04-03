package com.pratice.programming.india.datastructures.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        System.out.println(usingMap(array));

    }

    /**
     * Take a loop, Keep adding elements in HashMap<Interger, Integer> where key will be number, value will be count.
     */
    static boolean usingMap(int[] nums) {
        int count = 0;
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j])) {
                result = true;
                break;
            } else {
                map.put(nums[j], count);
            }
        }
        return result;
    }

    static boolean usingSet(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();

        for (int j = 0; j < nums.length; j++) {
            if (!set.add(nums[j])) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Naive approach with nested loop
     * Start from index 0, iterate through array,compare elements, return true(if equal)
     */
    static boolean usingNaive(int[] nums) {

        boolean result = false;
        int length = nums.length;

        if (length < 2)
            return result;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
