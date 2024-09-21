class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // case 1-> product of three largest
        int a = nums[n-1] * nums[n-2] * nums[n-3];
        // case 2-> product of two smallest and one largest
        int b = nums[0] * nums[1] * nums[n-1];
        return Math.max(a,b);
    }
}