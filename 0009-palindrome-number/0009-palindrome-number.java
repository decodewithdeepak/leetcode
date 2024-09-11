class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) return false; // negative no
        return n == reverse(n);
    }

    static int reverse(int n) { // O(n)
        if (n < 10) return n; // base case

        int smallAns = reverse(n / 10);
        int lastDigit = n % 10;
        int noOfDigits = (int) Math.log10(n);
        return smallAns + lastDigit * (int) Math.pow(10, noOfDigits);
    }
}