class Solution {
    public boolean isPalindrome(String s) {
        // Two Pointer Approach - TC: O(n) | SC: O(1)
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char lCh = s.charAt(left);
            char rCh = s.charAt(right);
            if (!Character.isLetterOrDigit(lCh)) {
                left++;
            } else if (!Character.isLetterOrDigit(rCh)) {
                right--;
            } else {
                if (Character.toLowerCase(lCh) != Character.toLowerCase(rCh)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
