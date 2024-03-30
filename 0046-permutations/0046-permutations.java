class Solution {

    // Method 2 : In-Place
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); // List to store all permutations
        helper(nums, 0, ans);
        return ans;
    }

    public static void helper(int[] nums, int idx, List<List<Integer>> ans) {
        if (idx == nums.length) { // Base Case
            List<Integer> l = new ArrayList<>();
            for (int num : nums) {
                l.add(num);
            }
            ans.add(l);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            helper(nums, idx + 1, ans); // Recursive Call
            swap(nums, idx, i); // Backtrack
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}