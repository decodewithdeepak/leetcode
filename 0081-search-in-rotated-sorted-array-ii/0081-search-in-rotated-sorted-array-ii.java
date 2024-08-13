class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true; // target found

            // skip duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // right half (mid to end) is sorted
            else if (nums[mid] <= nums[end]) {
                if (target > nums[mid] && target <= nums[end]) start = mid + 1; // search in right half
                else end = mid - 1; // search in left half
            }
            // left half (start to mid) is sorted
            else {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1; // search in left half
                else start = mid + 1; // search in right half
            }
        }
        return false; // not found
    }
}