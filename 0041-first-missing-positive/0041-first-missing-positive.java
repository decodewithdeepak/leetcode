class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }

        return smallest;
    }
}