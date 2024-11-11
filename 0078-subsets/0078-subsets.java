class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Brute Force - O(n^2)
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // add the empty subset
        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> subset : result) {
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(num);
                newSubsets.add(newSubset);
            }
            result.addAll(newSubsets);
        }
        return result;
    }
}