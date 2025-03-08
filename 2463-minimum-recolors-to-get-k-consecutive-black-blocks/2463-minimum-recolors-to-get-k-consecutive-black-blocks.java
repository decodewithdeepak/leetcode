class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minChanges = Integer.MAX_VALUE;

        // brute-force : try every substring of length k
        for (int i = 0; i <= n - k; i++) {
            int countW = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    countW++;
                }
            }
            minChanges = Math.min(minChanges, countW);
        }

        return minChanges;
    }
}
