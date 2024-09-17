class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nums1: query array, nums2: source array (next greater element in nums2 for each element in nums1)

        HashMap<Integer, Integer> hm = new HashMap<>(); // key: element, value: next greater element
        Stack<Integer> st = new Stack<>(); // stack to store elements in decreasing order
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) hm.put(nums2[i], -1);
            else hm.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = hm.get(nums1[i]);
        }
        
        return ans;
    }
}