class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        boolean match0 = true;
        boolean match90 = true;
        boolean match180 = true;
        boolean match270 = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (target[i][j] != mat[i][j]) match0 = false;
                if (target[i][j] != mat[n - j - 1][i]) match90 = false;
                if (target[i][j] != mat[n - i - 1][n - j - 1]) match180 = false;
                if (target[i][j] != mat[j][n - i - 1]) match270 = false;
            }
        }

        return match0 || match90 || match180 || match270;
    }
}
