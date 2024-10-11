class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Using Hashing - O(n) time, O(n) space

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Key - number nums[i], Value - index i

        for(int i=0; i<n; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}