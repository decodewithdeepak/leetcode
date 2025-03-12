class Solution {
    public int maximumCount(int[] nums) {
        int neg = lastNeg(nums) + 1;
        int pos = nums.length - firstPos(nums);
        return Math.max(pos, neg);
    }

    private int lastNeg(int[] nums) {
        int left = 0, right = nums.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                index = mid;
                left = mid + 1; // move right to find more -ve
            } else {
                right = mid - 1; // search -ve in left half
            }
        }
        return index;
    }

    private int firstPos(int[] nums) {
        int left = 0, right = nums.length - 1, index = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                index = mid;
                right = mid - 1; // move left to find earlier +ve
            } else {
                left = mid + 1; // search +ve in right half
            }
        }
        return index;
    }
}