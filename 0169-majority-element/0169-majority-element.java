class Solution {
    public int majorityElement(int[] nums) {
        // HashMap - O(n) approach
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // key -> element, value -> frequency
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
        return -1; // no majority element
    }
}