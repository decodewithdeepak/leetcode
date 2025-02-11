class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Staircase Search method : TC- O(m+n)

        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        int i = 0, j = n - 1; // start from top-right corner

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) return true; // target found
            else if (matrix[i][j] > target) j--; // move left
            else i++; // move down
        }

        return false; // target not found
    }
}