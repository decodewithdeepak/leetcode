class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums1){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int val : nums2){
            if(map.containsKey(val) && map.get(val) > 0){
                list.add(val);
                map.put(val, map.get(val) - 1);
            }
        }

        int[] arr = new int[list.size()];
        int idx = 0;
        for(int val : list){
            arr[idx++] = val;
        }

        return arr;
    }
}