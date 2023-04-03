package com.google.interview;


import java.util.PriorityQueue;

public class Solution {
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k + 1);

        for (int el : nums) {
            largeK.add(el);
            if (largeK.size() > k) {
                largeK.poll();
            }
        }
        return largeK.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}