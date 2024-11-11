class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Brute Force - O(n^2)
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // add the empty subset
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }
}