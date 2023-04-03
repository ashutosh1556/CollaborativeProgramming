package Rough;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPointerUsingHashmap {
    public static void main(String[] args) {
        int[] res = findSumTwoPointer(new int[]{1, 3, 5, 7, 8}, 4);

        for (int num : res)
            System.out.print(num + " ");
    }

    static int[] findSumTwoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] res = new int[2];

        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{left,right};
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            }
        }
        return res;
    }

    static int[] findSum(int[] arr, int target) {
        int[] resArr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                resArr[0] = map.get(diff);
                resArr[1] = i;
            } else map.put(arr[i], i);
        }
        return resArr;
    }
}
