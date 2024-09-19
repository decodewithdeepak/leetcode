class Solution {
    public int sumSubarrayMins(int[] arr) {
        // O(n) solution
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        int mod = (int) 1e9 + 7;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) arr[i] * left[i] * right[i]) % mod;
        }

        return (int) ans;
    }
}