class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLength = 0;
        int currentAnd = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            while ((currentAnd & nums[end]) != 0) {
                currentAnd ^= nums[start];
                start++;
            }
            currentAnd |= nums[end];
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
