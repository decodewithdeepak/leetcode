class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[i] >= nums[st.peek()]) {
                st.pop();
            }
            st.push(i);
            if (i - k + 1 >= 0) {
                ans[i - k + 1] = nums[st.get(0)];
            }
            if (i - k + 1 >= st.get(0)) {
                st.remove(0);
            }
        }
        return ans;
    }
}