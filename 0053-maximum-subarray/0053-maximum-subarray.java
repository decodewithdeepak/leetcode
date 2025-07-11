class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i]; // add current element
            maxSum = Math.max(maxSum, sum); // update max
            if (sum < 0) sum = 0; // reset if sum goes negative
        }
        return maxSum;
    }
}