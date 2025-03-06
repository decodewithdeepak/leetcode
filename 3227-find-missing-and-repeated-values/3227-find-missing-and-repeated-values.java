class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // first flatten the 2D array into 1D array
        int n = grid.length;
        int[] arr = new int[n * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx] = grid[i][j];
                idx++;
            }
        }

        // now find the repeated and missing values from the 1D array
        // Leetcode 645. Set Mismatch
        return findErrorNums(arr);

    }
    
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1]; // to store frequency of numbers
        int rep = -1, mis = -1;

        // count occurrences
        for (int num : nums) {
            count[num]++;
        }

        // identify repeated & missing numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) rep = i;
            if (count[i] == 0) mis = i;
        }

        return new int[]{rep, mis};
    }
}
