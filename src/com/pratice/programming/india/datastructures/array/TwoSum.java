package com.pratice.programming.india.datastructures.array;
/* Q: Given a source array of integers with possible duplicates and a target integer, write an algorithm to find out 2 numbers in source array whose sum is equal to target integer.
            array = {-1, 5, 2, -3, 4}
            target = 4

Assumptions: target is a valid integer
*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    private HashMap twoSumNaive(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        try {
            if (array.length == 0 || target < Integer.MIN_VALUE || target > Integer.MAX_VALUE) {
                return map;
            } else {
                for (int i = 0; i <= array.length - 2; i++) {
                    for (int j = i + 1; j <= array.length - 1; j++) {
                        if (array[i] + array[j] == target) {
                            map.put(array[i], array[j]);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Number not valid");
        }
        return map;
    }
    private HashMap twoSumOptimised(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (array.length == 0 || target < Integer.MIN_VALUE || target > Integer.MAX_VALUE) {
            return map;
        } else {
            Arrays.sort(array); // dual pivot quick sort

            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                if (array[left] + array[right] == target) {
                    map.put(array[left], array[right]);
                    left++;
                    right--;
                }
                if (array[left] + array[right] < target) {
                    left++;
                }
                if (array[left] + array[right] > target) {
                    right--;
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] array = {-1, 5, 2, -3, 4};
//        int[] array = {-3, -1, 2, 4, 5};
        int target = 4;
        System.out.println(obj.twoSumOptimised(array, target));
        System.out.println(obj.twoSumNaive(array, target));
    }

}
