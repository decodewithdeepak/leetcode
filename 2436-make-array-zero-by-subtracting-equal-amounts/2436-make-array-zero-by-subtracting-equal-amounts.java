class Solution {
    public int minimumOperations(int[] nums) {
        // no of opn = no of unique non zero elements 
        HashSet<Integer> uniqueNum = new HashSet<>();
        
        for (int num : nums) {
            if (num > 0) {
                uniqueNum.add(num);
            }
        }
        
        return uniqueNum.size();
    }
}