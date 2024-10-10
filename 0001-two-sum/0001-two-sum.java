class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using HashMap - O(n)
        Map<Integer, Integer> map = new HashMap<>();
        // Key - Number, Value - Index
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}