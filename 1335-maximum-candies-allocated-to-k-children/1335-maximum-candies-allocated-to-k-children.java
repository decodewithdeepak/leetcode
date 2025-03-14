class Solution {
    public int maximumCandies(int[] candies, long k) {
        // answer range : 1 to largest pile size
        int largest = 0;
        for (int c : candies) {
            largest = Math.max(largest, c);
        }

        int left = 1, right = largest, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long totalChild = 0;

            for (int c : candies) {
                totalChild += c / mid;
            }

            if (totalChild >= k) {
                ans = mid;
                left = mid + 1; // search for larger value in right
            } else {
                right = mid - 1; // search for smaller value in left
            }
        }

        return ans;
    }
}
