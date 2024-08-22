class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim(); // remove leading and trailing whitespaces
        int len = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') break; // break if space is found
            len++;
        }
        return len;
    }
}