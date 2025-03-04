class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums); // O(N log N)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}