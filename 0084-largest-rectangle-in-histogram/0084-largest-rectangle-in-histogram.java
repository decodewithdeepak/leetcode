class Solution {
    public int largestRectangleArea(int[] heights) {
        // Brute Force Approach - O(n^2)
        int n = heights.length;
        int maxArea = 0;
        
        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int left = i, right = i;
            while (left >= 0 && heights[left] >= h) {
                left--;
            }
            while (right < n && heights[right] >= h) {
                right++;
            }
            maxArea = Math.max(maxArea, h * (right - left - 1)); 
            // right - left - 1 -> width of rectangle
        }

        return maxArea;
    }
}