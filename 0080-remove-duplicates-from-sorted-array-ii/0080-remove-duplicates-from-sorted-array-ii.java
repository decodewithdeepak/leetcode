class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0; // left pointer
        int j = 1; // right pointer
        int count = 1; // count of the current element

        while (j < n) {
            if (nums[i] == nums[j]) {
                count++;
            } 
            else {
                count = 1;
            }

            if (count <= 2) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i + 1;
    }
}