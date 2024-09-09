class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Extended Moore's Voting Algorithm - O(n)
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Find potential candidates
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        
        for (int i = 0; i < n; i++) {
            // same candidate
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            } 
            // new candidate
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } 
            // different candidate
            else {
                count1--;
                count2--;
            }
        }

        // Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate1) count1++;
            else if (nums[i] == candidate2) count2++;
        }

        // Add valid candidates to the result
        if (count1 > n / 3) ans.add(candidate1);
        if (count2 > n / 3) ans.add(candidate2);

        return ans;
    }
}
