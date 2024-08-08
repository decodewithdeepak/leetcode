class Solution {
    public int subarraySum(int[] nums, int k) {
        // Optimized Approach- O(n)
        int n = nums.length;
        int prefSum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        // Key - Prefix Sum, Value - Frequency
        map.put(0, 1); // 0 sum has occurred 1 time
        for(int i=0; i<n; i++){
            prefSum = prefSum + nums[i];
            if(map.containsKey(prefSum - k)){
                count = count + map.get(prefSum - k);
            }
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return count;
    }
}