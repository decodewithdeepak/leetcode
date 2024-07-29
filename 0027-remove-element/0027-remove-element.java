class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0; // left pointer
        int j = 0; // right pointer

        while (j < n) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }
}