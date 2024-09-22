class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int i = 0; // s pointer
        int j = 0; // t pointer

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else j++;
        }

        return i == s.length();
    }
}
