class Solution {
    public int trap(int[] height) {
        // create two arrays left and right
        // left[i] = max height from 0 to i
        // right[i] = max height from i to n-1
        // ans[i] = min(left[i], right[i]) - height[i]
        // sum of all ans[i] is the answer

        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }

        right[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - height[i];
        }

        return ans;
    }
}