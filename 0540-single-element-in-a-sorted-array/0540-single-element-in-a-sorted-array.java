class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Binary Search - O(log n)
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 1) mid--; // to make mid even
            if (nums[mid] != nums[mid + 1]) end = mid; // single element in left half
            else start = mid + 2; // single element in right half
        }
        return nums[start];
    }
}