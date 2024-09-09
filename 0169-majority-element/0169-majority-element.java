class Solution {
    public int majorityElement(int[] nums) {
        // O(nlogn) approach - Sorting
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}