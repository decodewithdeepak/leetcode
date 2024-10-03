public class Solution {
    public int trailingZeroes(int n) {
        // Efficient solution - Count the number of 5s in the factorial
        // 150! = 150 * 149 * 148 * ... * 5 * 4 * 3 * 2 * 1
        // 5, 10, 15, 20, 25,..., 125, 130, 135, 140, 145, 150
        
        int countSum = 0;
        while (n > 0) {
            countSum += n / 5;
            n /= 5;
        }
        return countSum;
    }
}
