package com.google;

import java.util.ArrayList;
import java.util.HashMap;

class Epams {

    static void nextLargerElement(int[] arr, int n) {
        ArrayList<HashMap<String, Integer>> s = new ArrayList<HashMap<String, Integer>>();

        // iterating over the array
        for (int i = 0; i < n; i++) {
            while (s.size() > 0 && s.get(s.size() - 1).get("value") < arr[i]) {
                // updating the array as per the stack top
                HashMap<String, Integer> d = s.get(s.size() - 1);
                s.remove(s.size() - 1);
                arr[d.get("ind")] = arr[i];
            }
            // pushing values to stack
            HashMap<String, Integer> e = new HashMap<String, Integer>();

            e.put("value", arr[i]);
            e.put("ind", i);
            s.add(e);
        }

        // updating the array as per the stack top
        while (s.size() > 0) {
            HashMap<String, Integer> d = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            arr[d.get("ind")] = -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};

        int n = 5;

        // Function call
        nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}