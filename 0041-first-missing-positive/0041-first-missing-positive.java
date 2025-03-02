class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // place numbers at their correct index (num -> nums[num - 1])
        while (i < n) {
            int newIdx = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[newIdx]) {
                swap(nums, i, newIdx);
            } else {
                i++;
            }
        }

        // find first missing positive
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // if all numbers are in place then return n + 1
        return n + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
