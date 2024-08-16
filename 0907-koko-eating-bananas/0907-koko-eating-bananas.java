class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int low = 1, high = maxPile;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int hours = 0;
            
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
                if (hours > h) break; // exit if hours exceed h
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
