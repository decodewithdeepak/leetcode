class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // Without using Stack - O(n^2)
        // int n = nums.length;
        // int[] ans = new int[n];
        // for (int i = 0; i < n; i++) {
        //     ans[i] = -1;
        //     for (int j = i + 1; j < i + n; j++) {
        //         if (nums[j % n] > nums[i]) { // 
        //             ans[i] = nums[j % n];
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // Using Stack - O(n)
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i % n] >= st.peek()) {
                st.pop();
            }
            ans[i % n] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i % n]);
        }
        return ans;
    }
}