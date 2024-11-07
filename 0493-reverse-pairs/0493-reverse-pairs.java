class Solution {
    public int reversePairs(int[] nums) {
        // Optimized Approach - O(nlogn)
        // Using merge sort technique
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

        // Counting the reverse pairs
        for (int i = left, j = mid + 1; i <= mid; i++) {
            while (j <= right && nums[i] > 2L * nums[j]) j++;
            count += j - (mid + 1);
        }

        // Merging the two sorted arrays
        Arrays.sort(nums, left, right + 1);
        return count;
    }
}