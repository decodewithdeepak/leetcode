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

        // find the repeated and missing values from the 1D array
        int[] result = new int[2];

        // find repeated value
        for (int i = 0; i < n * n; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1];
            } else {
                result[0] = val;
            }
        }

        // find missing value
        for (int i = 0; i < n * n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
}
