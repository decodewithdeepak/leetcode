class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // key = number, value = index

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int diff = target - curr;
            if (map.containsKey(diff)) { // found the pair
                return new int[] {map.get(diff), i};
            }
            map.put(curr, i); // store number with its index
        }

        return new int[] {}; // no answer found
    }
}
