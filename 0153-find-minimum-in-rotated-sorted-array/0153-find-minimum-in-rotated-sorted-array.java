class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            ans = Math.min(ans, nums[mid]);

            if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}