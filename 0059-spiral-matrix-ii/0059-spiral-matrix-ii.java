class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int curr = 1; // current element to be filled

        while (curr <= n*n) {
            // Traverse top row
            for (int j = left; j <= right && curr <= n*n; j++) {
                matrix[top][j] = curr++;
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom && curr <= n*n; i++) {
                matrix[i][right] = curr++;
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int j = right; j >= left && curr <= n*n; j--) {
                    matrix[bottom][j] = curr++;
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top && curr <= n*n;  i--) {
                    matrix[i][left] = curr++;
                }
                left++;
            }
        }

        return matrix;
    }
}