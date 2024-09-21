class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // traverse from right to left
        for(int i = n - 1; i >= 0; i--) {
            digits[i]++; // add 1 to the digit
            if (digits[i] < 10) return digits; // if no carry, return the array
            else digits[i] = 0; // if 10, make it 0 and carry 1 to next digit
        }

        // if all digits are 9 => 999 + 1 = 1000
        digits = new int[n + 1];
        digits[0] = 1; // and by default all other digits are 0
        return digits;
    }
}