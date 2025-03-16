class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = (long) ranks[0] * cars * cars;
        
        for (int rank : ranks) {
            right = Math.min(right, (long) rank * cars * cars);
        }
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canRepairAllCarsInTime(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private boolean canRepairAllCarsInTime(int[] ranks, int cars, long time) {
        long totalCarsRepaired = 0;
        for (int rank : ranks) {
            totalCarsRepaired += Math.sqrt(time / rank);
            if (totalCarsRepaired >= cars) {
                return true;
            }
        }
        return false;
    }
}
