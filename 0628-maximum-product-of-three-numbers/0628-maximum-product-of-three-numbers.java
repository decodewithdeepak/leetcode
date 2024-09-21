class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // case 1-> product of three largest
        // case 2-> product of two smallest and one largest
        int pro = Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);
        return pro;
    }
}