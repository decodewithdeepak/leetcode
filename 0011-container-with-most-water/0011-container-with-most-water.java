class Solution {
    public int maxArea(int[] height) {
        // Two Pointer Approach - O(n)
        int n = height.length;
        int left = 0, right = n-1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h*w);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}