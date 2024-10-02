class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Using Stack - O(n*m) - Concept of Largest Rectangle in Histogram
        if (matrix.length == 0) return 0;
        
        int r = matrix.length; // rows
        int c = matrix[0].length; // columns
        int maxArea = 0;

        int[] heights = new int[c];
        for (int i = 0; i < r; i++) {
            // calculate heights array
            for (int j = 0; j < c; j++) {
                // If matrix[i][j] is '1'-> increase the height; otherwise reset to 0
                if (matrix[i][j] == '1') heights[j]++;
                else heights[j] = 0;
            }
            // calculate max area
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
