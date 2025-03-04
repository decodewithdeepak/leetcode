class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = sumOfSquares(slow);  
            fast = sumOfSquares(sumOfSquares(fast)); 
        } while (slow != fast && fast != 1);

        return fast == 1;
    }

    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}