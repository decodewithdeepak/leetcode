class Solution {
    public void rotate(int[][] matrix) {
        // transpose of matrix
        transposeMatrix(matrix);

        // reverse each row of transposed matrix
        for (int i = 0; i < matrix.length; i++) { // rows
            reverseArray(matrix[i]);
        }
    }


    public void transposeMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++; 
            j--;
        }
    }

}