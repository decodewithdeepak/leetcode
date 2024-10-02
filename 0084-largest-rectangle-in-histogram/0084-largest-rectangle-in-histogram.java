class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        // Using common helper functions for PSE and NSE
        int[] left = prevSmaller(heights);
        int[] right = nextSmaller(heights);

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1; // width of the rectangle
            int area = heights[i] * width; // height * width
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