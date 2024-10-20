class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int val : nums1){
            set.add(val);
        }

        HashSet<Integer> ans = new HashSet<>();
        for(int val : nums2){
            if(set.contains(val)){
                ans.add(val);
            }
        }

        int[] arr = new int[ans.size()];
        int idx = 0;
        for(int val : ans){
            arr[idx++] = val;
        }

        return arr;
    }
}