class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Bruteforce - O(n)
        int ans = 0;
        for (int num : nums) {
            ans ^= num; // XOR
        }
        return ans;  
    }
}