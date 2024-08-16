class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 1_000_000_000; // 10^9

        while (low < high) {
            int mid = low + (high - low) / 2;
            int hours = 0;

            for (int pile : piles) {
                hours += Math.ceil((double) pile / mid);
            }

            if (hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
