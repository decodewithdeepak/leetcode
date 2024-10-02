class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int m = matrix.length, n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        // Iterate over each row and calculate largest rectangle
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If matrix[i][j] is '1', increase the height; otherwise, reset to 0
                heights[j] = matrix[i][j] == '1' ? heights[j] + 1 : 0;
            }

            // Calculate the largest rectangle area for the current row's histogram
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    // Reuse the largestRectangleArea function from the Histogram problem
    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        int[] left = prevSmaller(heights);
        int[] right = nextSmaller(heights);

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    
    // Finds Previous Smaller Element (PSE) for each index
    public static int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }

    // Finds Next Smaller Element (NSE) for each index
    public static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return right;
    }
}
