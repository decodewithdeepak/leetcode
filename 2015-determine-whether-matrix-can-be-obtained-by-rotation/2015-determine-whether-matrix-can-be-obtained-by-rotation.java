import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] rotated = mat;
        // Try all 4 rotations
        for (int k = 0; k < 4; k++) {
            if (Arrays.deepEquals(rotated, target)) {
                return true;
            }
            rotated = rotate90(rotated);
        }
        return false;
    }
    
    // Helper function to rotate the matrix by 90 degrees
    public int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

}
