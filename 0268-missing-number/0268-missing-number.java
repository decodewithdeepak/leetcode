class Solution {
    public int missingNumber(int[] nums) {
        // Missing no. = Actual sum - Calculated sum
        int n = nums.length;
        int sum = 0; // calc sum
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        int actualSum = (n*(n+1))/2;
        int missingNum = actualSum - sum;
        return missingNum;
    }
}