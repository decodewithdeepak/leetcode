class Solution {
    public String longestPalindrome(String s) {
        // Brute Force - O(N³)
        int n = s.length();
        String longest = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    String sub = s.substring(i, j + 1);
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }
        return longest;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
