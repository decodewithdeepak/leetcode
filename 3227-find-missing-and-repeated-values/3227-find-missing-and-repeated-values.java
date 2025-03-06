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

        int[] ans = findErrorNums(arr);
        return ans;

    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int rep = -1, mis = -1;

        for (int val = 1; val <= n; val++) { // iterate through possible values (1 to n)
            int cnt = 0;

            // count occurrences of val in the array
            for (int i = 0; i < n; i++) {
                if (nums[i] == val) cnt++;
            }

            if (cnt == 2) rep = val;
            else if (cnt == 0) mis = val;

            if (rep != -1 && mis != -1) break;
        }

        return new int[]{rep, mis};
    }
}
