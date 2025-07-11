public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // indices (i,j) should differ by k distance
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true; // found duplicate within k distance
                }
            }
        }
        return false;
    }
}
