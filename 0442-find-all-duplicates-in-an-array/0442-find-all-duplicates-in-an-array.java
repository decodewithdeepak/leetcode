class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Using Negation - O(n) time, O(1) space
        List<Integer> dup = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1; // index of no nums[i]
            if(nums[idx] < 0){ // if no is already negated then it is duplicate
                dup.add(Math.abs(nums[i])); // add duplicate no to list
            }
            nums[idx] = -nums[idx]; // mark no as visited by negating
        }
        return dup;
    }
}