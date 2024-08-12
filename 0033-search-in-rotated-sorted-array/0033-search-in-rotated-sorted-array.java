class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid; // target found
            else if (nums[mid] <= nums[end]) {  // mid to end is sorted
                if (target > nums[mid] && target <= nums[end]) start = mid + 1; // search in right half
                else end = mid - 1; // search in left half
            } 
            else { // st to mid is sorted
                if (target >= nums[start] && target < nums[mid]) end = mid - 1; // search in left half
                else start = mid + 1; // search in right half
            }
        }
        return -1; // not found
    }
}