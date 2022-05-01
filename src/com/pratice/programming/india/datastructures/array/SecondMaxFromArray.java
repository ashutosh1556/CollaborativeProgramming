package com.pratice.programming.india.datastructures.array;

import java.util.Arrays;

/**
 * Questions:
 * 1. Can array have duplicate numbers?
 * 2. Can array have negative numbers?
 * 3. What output do we expect if array is empty or have less than 2 elements?
 * <p>
 * Approaches:
 * 1. Apply sorting on array and return second last index value. Complexity O(n logn), Space: O(1)
 * 2. Use loop and compare the two variables FirstMax and SecondMax. Complexity O(n), Space: O(1)
 * <p>
 * TestCases:
 * 1. int[] arr = {7, 2, 1, 4, 5}; // Happy Path
 * 2. int[] arr = {1, 1, 1, 1}; // Negative (No SecondMax available)
 * 3. int[] arr = {}; // Boundary Case
 * 4. int[] arr = {1, 2}; // Boundary Case
 * 5. int[] arr = {1,-2, 3, -4}; // Negative Numbers
 */

public class SecondMaxFromArray {

    /**
     * This is a efficient approach in terms of time complexity and
     * works well with duplicate and negative numbers.
     */
    static int secondMaxWithoutSort(int[] arr) {
        int len = arr.length;
        if (len < 2)
            return -1;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    /**
     * Exception: This approach does not work with duplicate elements.
     * Example: int[] arr = {1,2,2};
     * In this case FirstMax and SecondMax is 2, which is not correct.
     * Refer Code below
     */
    static int secondMaxUsingSort(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        return arr[len - 2];
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 4, 5};
        int result = secondMaxWithoutSort(arr);

        System.out.println("Second Highest is: " + result);
    }
}
