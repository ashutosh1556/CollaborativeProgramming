package Rough;

public class TwoDMatrixTraversal {
    public static void main(String[] args) {
//        int[][] intArray = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int[][] intArray = new int[3][4];
        int rowLength = intArray.length;
        int colLength = intArray[0].length;

        int count = 0;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                intArray[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}


