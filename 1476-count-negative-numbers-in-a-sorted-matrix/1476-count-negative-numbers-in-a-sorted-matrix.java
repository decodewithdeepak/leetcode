class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int ans = 0;
        int r = rows - 1, c = 0; // start at bottom-left corner

        while (r >= 0 && c < cols) {
            if (grid[r][c] < 0) {
                ans += (cols - c); // all numbers to the right are also -ve
                r--; // move up
            } else {
                c++; // move right
            }
        }
        return ans;
    }
}