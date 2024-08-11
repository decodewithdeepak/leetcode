class Solution {
    public int mySqrt(int x) {
        // Binary Search - O(log x)
        int start = 1, end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) return mid;
            else if (mid < x / mid) {
                start = mid + 1;
                ans = mid;
            } else { // mid > x / mid
                end = mid - 1;
            }
        }
        return ans;
    }
}