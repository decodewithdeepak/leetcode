class Solution {
    public int maxSubArray(int[] nums) {
        // O(n) approach - Kadane's Algorithm
        // Rules-
        // 1. Calculate sum of subarray
        // 2. Update maxSum
        // 3. If sum < 0, reset sum to 0
        
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}