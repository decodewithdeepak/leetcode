class Solution {
    public int subarraySum(int[] nums, int k) {
        // Brute Force Approach- O(n^2)
        int n = nums.length;
        int count = 0;
        for(int start=0; start<n; start++){
            int sum = 0;
            for(int end=start; end<n; end++){
                sum = sum + nums[end];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;   
    }
}