class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1000000000;
        while (low < high) {
            int mid = (low+high)/2;
            // if she can't eat all, mid is too low
            if (!canEatAll(mid, piles, h)) low = mid+1;
            else high = mid;
        }
        return low;
    }

    private boolean canEatAll(long k, int[] piles, int h) {
        int hours = 0;
        for (int pile: piles) {
            hours += (int) Math.ceil((double)pile/k);

            if (hours > h) return false;
        }
        return true;
    }
}