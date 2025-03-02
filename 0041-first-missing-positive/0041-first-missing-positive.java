class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); // O(N log N)
        int smallest = 1;

        for (int num : nums) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
    }
}
