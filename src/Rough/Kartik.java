package Rough;

import java.util.ArrayList;

public class Kartik {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 15;
        System.out.println(subArraySum(arr, targetSum));
    }

    static ArrayList<Integer> subArraySum(int[] arr, int targetSum) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int sum = arr[i], startIndex = i;
            for (int j = i + 1; j <= arr.length; j++) {
                if (sum == targetSum) {
                    int lastIndex = j - 1;
                    list.add(startIndex);
                    list.add(lastIndex);
                }
                if (sum > targetSum || j == arr.length) break;

                sum = sum + arr[j];
            }
        }
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }
        return list;
    }
}
