class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int) 1e9 + 7;
        long sum = 0;
        
        // Using common helper functions for PSE and NSE
        int[] left = prevSmaller(arr);
        int[] right = nextSmaller(arr);

        for (int i = 0; i < n; i++) {
            long leftDist = i - left[i];
            long rightDist = right[i] - i;
            sum = (sum + (long) arr[i] * leftDist * rightDist) % mod;
        }

        return (int) sum;
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
