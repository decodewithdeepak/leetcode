class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // find sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // start sliding window
        int start = 0, end = k;
        while (end < nums.length) {
            // remove old leftmost & add new rightmost
            sum = sum - nums[start] + nums[end]; 
            maxSum = Math.max(maxSum, sum);
            start++;
            end++;
        }

        return (double) maxSum / k;
    }
}