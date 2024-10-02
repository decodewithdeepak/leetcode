class Solution {
    public int largestRectangleArea(int[] heights) {
        // Using Stack - O(n) - Concept of NSE and PSE
        int maxArea = 0;
        
        int[] ps = prevSmaller(heights);
        int[] ns = nextSmaller(heights);

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