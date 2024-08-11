class Solution {
    public int mySqrt(int x) {
        // Bruteforce - O(sqrt(n))
        int ans = 0;
        for (int i = 1; i <= x/i; i++) {
            ans = i;
        }
        return ans;
    }
}