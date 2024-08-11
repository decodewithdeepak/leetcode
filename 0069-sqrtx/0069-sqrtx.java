class Solution {
    public int mySqrt(int x) {
        // Binary Search - O(log x)
        int start = 1, end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                start = mid + 1;
            } else { // square > x
                end = mid - 1;
            }
        }
        return end; // If no perfect square is found, return the floor value
    }
}