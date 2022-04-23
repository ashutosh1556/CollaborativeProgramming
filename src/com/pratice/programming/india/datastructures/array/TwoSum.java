package com.pratice.programming.india.datastructures.array;
/* Q: Given a source array of integers with possible duplicates and a target integer, write an algorithm to find out 2 numbers in source array whose sum is equal to target integer.
            array = {-1, 5, 2, -3, 4}
            target = 4

Clarifying questions:
1. Can array have -negative numbers as well?
2. What should be returned if it did not find such pair?
3. Min/Maximum length of array?
4. Min/Maximum target number?

Test Cases:
1. int[] arr = {2,6,3,4,5}, target = 9 // Positive - Pair found
2. int[] arr = {0,-1,2,1,-2}, target = 9 // Negative - no pair found

Special Case:
3. int[] arr = {-1,-3,-2,-4}, target = 2  // Logic do not handle all negative numbers
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] array = {-1, 5, 2, -3, 4};
        int target = 4;
//        System.out.println(obj.twoSumNaive(array, target));
//        System.out.println(obj.twoSumWithTwoPointer(array, target));
        System.out.println(Arrays.toString(obj.twoSumWithHashMap(array, target)));

    }

    /**
     * @param array  Take input array of integers from main()
     * @param target Take input integer from main()
     * @return Hashmap<Integer, Integer>, with
     * key     as first number from Array
     * Value   as second number from Array
     * When there is a match
     * <p>
     * Hashmap<Integer, Integer> with
     * key     as Empty
     * Value   as Empty
     * When there is no match
     */
    HashMap<Integer, Integer> twoSumNaive(int[] array, int target) {
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

    HashMap<Integer, Integer> twoSumWithTwoPointer(int[] array, int target) {
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

    private int[] twoSumWithHashMap(int[] arr, int target) {
        int len = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        if (target < Integer.MIN_VALUE || target > Integer.MAX_VALUE) return result;
        if (len < 2) return result;

        for (int i = 0; i <= arr.length - 1; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                result[1] = i;
                result[0] = map.get(diff);
                return result;
            }
            if (map.containsKey(arr[i])) continue;
            map.put(arr[i], i);
        }
        return result;
    }
}