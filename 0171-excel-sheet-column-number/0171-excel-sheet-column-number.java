class Solution {
    public int titleToNumber(String columnTitle) {
        // TC: O(n) | SC: O(1)
        int sum = 0, pos = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int num = columnTitle.charAt(i) - 64; // A=>65
            sum = sum + (int) Math.pow(26, pos) * num;
            pos++;
        }
        return sum;
    }
}