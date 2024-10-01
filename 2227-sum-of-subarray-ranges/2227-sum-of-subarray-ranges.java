class Solution {
    public long subArrayRanges(int[] nums) {
        // Using Stack - O(n)

        // ∑ (max - min) = ∑ max - ∑ min
        // ∑ max = sum of subarray maximums
        // ∑ min = sum of subarray minimums

        return sumSubarrayMax(nums) - sumSubarrayMin(nums);
    }

    private long sumSubarrayMax(int[] arr) {
        int n = arr.length;
        long sum = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Process for maximums
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int j = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                sum += (long) arr[j] * (j - left) * (i - j);
            }
            st.push(i);
        }

        // Clear remaining elements in the stack
        while (!st.isEmpty()) {
            int j = st.pop();
            int left = st.isEmpty() ? -1 : st.peek();
            sum += (long) arr[j] * (j - left) * (n - j);
        }

        return sum;
    }

    private long sumSubarrayMin(int[] arr) {
        int n = arr.length;
        long sum = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Process for minimums
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int j = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                sum += (long) arr[j] * (j - left) * (i - j);
            }
            st.push(i);
        }

        // Clear remaining elements in the stack
        while (!st.isEmpty()) {
            int j = st.pop();
            int left = st.isEmpty() ? -1 : st.peek();
            sum += (long) arr[j] * (j - left) * (n - j);
        }

        return sum;
    }
}