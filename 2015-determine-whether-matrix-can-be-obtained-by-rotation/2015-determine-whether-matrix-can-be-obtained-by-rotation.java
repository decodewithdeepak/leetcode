class Solution {
    public boolean findRotation(int[][] mat, int[][] target){
        int r = mat.length;
        int c = mat[0].length;

        // 4 rotations
        for (int k = 0; k < 4; k++){
            // Transpose of Matrix
            for (int i = 0; i < r; i++) {
                for (int j = i + 1; j < c; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            // Reverse each row of transposed matrix
            for (int i = 0; i < r; i++) {
                int left = 0;
                int right = c - 1;

                while (left < right) {
                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;

                    left++;
                    right--;
                }
            }

            if (Arrays.deepEquals(mat, target)) {
                return true;
            }            
        }
        return false;
    }
}