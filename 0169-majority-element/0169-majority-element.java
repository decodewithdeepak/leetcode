class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = 0, count = 0;
        for(int i=0; i<n; i++){
            if(count == 0){ // new candidate
                candidate = nums[i];
                count = 1;
            }
            else if(candidate == nums[i]){ // same candidate
                count++;
            } else { // different candidate
                count--;
            }

        }
        return candidate;
    }
}