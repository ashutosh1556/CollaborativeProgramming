package Rough;

public class MinimumJumps {
    static int jump(int[] A) {
        int sc = 0;
        int e = 0;
        int max = 0;
        for (int i = 0; i < A.length - 1; i++) {
            max = Math.max(max, i + A[i]);
            if (i == e) {
                sc++;
                e = max;
            }
        }
        return sc;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr[] = {1, 4, 3, 2, 6, 7};
        System.out.println(jump(arr));
    }
}
