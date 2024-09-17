class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // Brute Force Approach - O(n^2)
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = i + 1; j < i + n; j++) {
                if (nums[j % n] > nums[i]) { // j%n to handle circular array
                    ans[i] = nums[j % n];
                    break;
                }
            }
        }
        return ans;
    }
}