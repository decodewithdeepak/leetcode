class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Using Stack - O(n*m)
        if (matrix.length == 0) return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // calculate heights array
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') heights[j]++;
                else heights[j] = 0;
            }

            // calculate max area for each row
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }
    
    public int largestRectangleArea(int[] heights) {
        // Using Stack - O(n) - Concept of NSE and PSE
        int maxArea = 0;
        
        int[] ps = prevSmaller(heights); // previous smaller element on left
        int[] ns = nextSmaller(heights); // next smaller element on right

        for (int i = 0; i < heights.length; i++) {
            int currArea = heights[i] * (ns[i] - ps[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    private int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }
}