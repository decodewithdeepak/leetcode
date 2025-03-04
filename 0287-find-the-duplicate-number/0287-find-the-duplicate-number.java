class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        for (int num : nums) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }
        return -1;
    }
}