class Solution {
    public void setZeroes(int[][] matrix) {
        // Brute Force Approach - O(m*n) time complexity
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // Store the row and column index with value 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Iterate over the array and use the row and col arrays to update the elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}