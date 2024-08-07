class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2; // To avoid integer overflow -> Better than (start + end) / 2

            // Check if the middle element is the target
            if (target == nums[mid]) {
                return mid;
            }

            // If the target is greater than the middle element -> Ignore the left half
            if (target > nums[mid]) {
                start = mid + 1;
            } 
            // If the target is less than the middle element -> Ignore the right half
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}