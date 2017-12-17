package practice9;

public class SumOfMatrixRowMaximums {

    public static void main(String[] args) {

        int [] row1 = {4, 6, 1, 9};
        int [] row2 = {-5, -10, -12};
        int [] row3 = {0, 2, 1};

        int[][] matrix = {
                row1,
                row2,
                row3,
        };

        System.out.println(maxOfRow(row1));
        System.out.println(maxOfRow(row2));
        System.out.println(maxOfRow(row3));

        System.out.println(sumOfRowMax(matrix));
    }


    private static int sumOfRowMax (int [] [] matrix) {
        int sum = 0;
        for (int i = 0; i <matrix.length; i++){
            sum += maxOfRow(matrix[i]);
        }
        return sum;
    }

    private static int maxOfRow  (int [] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){

            if (max < array [i])
                max = array [i];
        }

        return max;
    }
}
