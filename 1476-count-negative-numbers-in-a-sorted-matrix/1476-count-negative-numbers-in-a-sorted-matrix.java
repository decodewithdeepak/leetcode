class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length; // rows
        int n = grid[0].length; // columns
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) ans++;
            }
        }
        return ans;
    }
}