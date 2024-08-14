class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
               
        while (start < end) {
            int mid = start + (end - start) / 2;
            // right half is sorted
            if (nums[mid] <= nums[end]) {
                end = mid; // minimum in left half or at mid
            } 
            // left half is sorted
            else { // nums[mid] > nums[end]
                start = mid + 1; // minimum in right half
            }
        }
        return nums[start]; // start == end, minimum found
    }
}