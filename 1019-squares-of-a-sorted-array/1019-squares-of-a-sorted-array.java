class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];
        int i = 0; // left pointer
        int j = n - 1; // right pointer
        int k = n - 1; // squares array pointer

        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                squares[k] = nums[i] * nums[i];
                i++;
            } 
            else {
                squares[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return squares;
    }
}