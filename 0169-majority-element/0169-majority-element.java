class Solution {
    public int majorityElement(int[] nums) {
        // O(n) approach - Moore's Voting Algorithm
        // Rules-
        // 1. Find candidate to be majority element
        // 2. Check if candidate is majority element

        int n = nums.length;
        int candidate = 0, count = 0;
        for(int i=0; i<n; i++){
            if(count == 0){ // new candidate
                candidate = nums[i];
            }
            if(candidate == nums[i]){ // same candidate
                count++;
            } else { // different candidate
                count--;
            }
        }
        return candidate;
    }
}