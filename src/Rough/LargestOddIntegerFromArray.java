package Rough;

public class LargestOddIntegerFromArray {

    static int findLargestOdd(int[] arr) {
        // 1,3, 5,7
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (max < arr[i]) max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 5, 7, -9};
        System.out.println(findLargestOdd(arr));
    }
}
