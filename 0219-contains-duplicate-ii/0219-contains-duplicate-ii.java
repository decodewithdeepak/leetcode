class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // i -> currIndex
            if (map.containsKey(nums[i])) { // duplicate
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true; // with condition
                }
            }
            map.put(nums[i], i); // store or update index
        }

        return false;
    }
}