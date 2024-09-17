class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nums1: query array, nums2: source array (next greater element in nums2 for each element in nums1)

        int ngl[] = nextGreaterElement(nums2);

        HashMap<Integer, Integer> hm = new HashMap<>();
        // key: element, value: next greater element
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], ngl[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }

    public int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}