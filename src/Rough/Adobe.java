package Rough;

import java.util.ArrayList;
import java.util.List;

public class Adobe {

    // Function to find k pairs with least sum such
    // that one element of a pair is from arr1[] and
    // other element is from arr2[]
    static void kSmallestPair(int[] arr1, int n1, int[] arr2, int n2, int k) {
        if (k > n1 * n2) {
            System.out.print("k pairs don't exist");
            return;
        }

        // Stores current index in arr2[] for
        // every element of arr1[]. Initially
        // all values are considered 0.
        // Here current index is the index before
        // which all elements are considered as
        // part of output.
        int[] index2 = new int[n1];

        while (k > 0) {
            // Initialize current pair sum as infinite
            int min_sum = Integer.MAX_VALUE;
            int min_index = 0;

            // To pick next pair, traverse for all
            // elements of arr1[], for every element, find
            // corresponding current element in arr2[] and
            // pick minimum of all formed pairs.
            for (int i1 = 0; i1 < n1; i1++) {
                // Check if current element of arr1[] plus
                // element of array2 to be used gives
                // minimum sum
                if (index2[i1] < n2 && arr1[i1] + arr2[index2[i1]] < min_sum) {
                    // Update index that gives minimum
                    min_index = i1;

                    // update minimum sum
                    min_sum = arr1[i1] + arr2[index2[i1]];
                }
            }

            System.out.print("(" + arr1[min_index] + ", " + arr2[index2[min_index]] + ") ");

            index2[min_index]++;
            k--;
        }
    }

    static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int total = nums1.length * nums2.length;
        if (total < k) {
            k = total;
        }

        List<int[]> result = new ArrayList<int[]>();
        int[] idx = new int[nums1.length];//track each element's cursor in nums2
        while (k > 0) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = 0; i < nums1.length; i++) {
                if (idx[i] < nums2.length && nums1[i] + nums2[idx[i]] < min) {
                    minIdx = i;
                    min = nums1[i] + nums2[idx[i]];
                }
            }
            result.add(new int[]{nums1[minIdx], nums2[idx[minIdx]]});
            idx[minIdx]++;
            k--;
        }

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr2 = {1, 7, 11};
        int n1 = arr2.length;

        int[] arr1 = {2, 4, 6};
        int n2 = arr1.length;

        int k = 4;
        List<int[]> list = kSmallestPairs(arr1, arr2, k);

        for (int i = 0; i < list.size(); i++) {


        }
        System.out.println();
    }
}
