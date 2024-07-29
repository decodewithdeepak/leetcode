class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0; // left pointer
        int j = 1; // right pointer

        while (j < n) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i + 1;
    }
}
