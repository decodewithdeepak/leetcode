class Solution {
    public int removeDuplicates(int[] nums) {
        // Using Two Pointers - O(n) time, O(1) space
        int n = nums.length;
        int i = 0;
        for(int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
