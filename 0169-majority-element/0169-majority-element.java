class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0], count = 1;
        for(int i=1; i<n; i++){
            if(nums[i] == candidate){ // same candidate
                count++;
            } else { // different candidate
                count--;
            }
            if(count == 0){ // new candidate
                candidate = nums[i];
                count = 1;
            }
        }
        return candidate;
    }
}