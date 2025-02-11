class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length; // rows
        int n = arr[0].length; // columns
        if (m == 0 || n == 0) return false;

        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if (arr[i][j] == target) return true;
            else if (arr[i][j] > target) j--;
            else i++;
        }

        return false;
    }
}