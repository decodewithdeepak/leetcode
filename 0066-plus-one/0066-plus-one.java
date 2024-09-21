class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // traverse from right to left
        for(int i = n - 1; i >= 0; i--) {
            // if digit is less than 9, increment and return
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // if digit is 9, make it 0
            else digits[i] = 0;
        }

        // if all digits are 9 => 999 + 1 = 1000
        digits = new int[n + 1];
        digits[0] = 1; // and by default all other digits are 0
        return digits;
    }
}