class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = 0, count = 0;
        for(int i = 0; i<n ; i++){
            if (count == 0) candidate = nums[i]; // new element
            if (candidate == nums[i]) count++; // same element 
            else count--; // diff element
        }
        return candidate;
    }
}