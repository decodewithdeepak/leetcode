class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1]; // to store frequency of numbers
        int rep = -1, mis = -1;

        // count occurrences
        for (int num : nums) {
            count[num]++;
        }

        // identify repeated & missing numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) rep = i;
            if (count[i] == 0) mis = i;
        }

        return new int[]{rep, mis};
    }
}