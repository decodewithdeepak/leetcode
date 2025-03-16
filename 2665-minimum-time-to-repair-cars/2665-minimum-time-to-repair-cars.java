class Solution {
    public long repairCars(int[] ranks, int cars) {
        // binary serach on time
        long left = 1, right = (long) ranks[0] * cars * cars;

        for (int rank : ranks) {
            right = Math.min(right, (long) rank * cars * cars);
        }

        while (left < right) {
            long mid = left + (right - left) / 2;
            long totalCarsRepaired = 0;

            for (int rank : ranks) {
                totalCarsRepaired += Math.sqrt(mid / rank);
                if (totalCarsRepaired >= cars) break; // no need to check further
            }

            if (totalCarsRepaired >= cars) {
                right = mid; // try for a smaller time
            } else {
                left = mid + 1; // increase time
            }
        }

        return left; // minimum time required
    }
}
