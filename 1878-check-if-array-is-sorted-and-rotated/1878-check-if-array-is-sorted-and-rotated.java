class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        // only one pair should exist
        int noOfPair = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] > nums[i]) {
                noOfPair++;
            }
        }
        // now compare first and last element (cyclic)
        if(nums[n-1] > nums[0]){
            noOfPair++;
        }

        return noOfPair <= 1;  // <1 if all elemnts are same
    }
}