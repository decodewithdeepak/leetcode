class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // negative no
        return x == reverse(x);
    }

    static int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            int digit = x % 10; // extract last digit
            rev = rev * 10 + digit; // add last digit to rev
            x /= 10; // remove last digit
        }
        return rev;
    }
}