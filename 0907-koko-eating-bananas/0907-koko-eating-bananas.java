class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       // Binary Search - O(n * log m), where n = number of piles, m = max bananas in a pile
        // We will apply binary search on eating speeds: 1 2 3 4 5 6 7 8 9 10 11 ... maxPile

        int maxPile = 0; // max bananas in a pile
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        // range of eating speeds = 1 to maxPile

        int low = 1, high = maxPile;

        if (piles.length == h) return high;

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