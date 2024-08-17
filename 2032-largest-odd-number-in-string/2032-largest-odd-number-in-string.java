class Solution {
    public String largestOddNumber(String num) {
        // traverse from right to left
        for (int i = num.length() - 1; i >= 0; i--) {
            int dig = num.charAt(i) - '0'; // convert char to int
            if (dig % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}