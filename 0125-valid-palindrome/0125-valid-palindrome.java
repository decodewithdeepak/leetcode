class Solution {
    public boolean isPalindrome(String s) {
        // first lowercase and remove non-alphanumeric
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0; // left pointer
        int end = s.length() - 1; // right pointer
        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}