class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);
        return new int[]{first, last};
    }
    
    // Helper method to find the first occurrence of the target
    public int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    firstOccurrence = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstOccurrence;
    }

    // Helper method to find the last occurrence of the target
    public int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    lastOccurrence = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }
}
