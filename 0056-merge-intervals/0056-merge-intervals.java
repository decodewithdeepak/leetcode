class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Sort by ascending start point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();
        int[] currInterval = intervals[0];
        // Add the first interval to the list
        list.add(currInterval);

        for (int[] interval : intervals) {   
            // 0 -> start, 1 -> end         
            if (interval[0] <= currInterval[1]) {
                // Overlapping intervals, update the end if needed
                currInterval[1] = Math.max(currInterval[1], interval[1]);
            }
            else {
                // Disjoint intervals, add the new interval to the list
                currInterval = interval;
                list.add(currInterval);
            }
        }

        // Convert List<int[]> to int[][]
        return list.toArray(new int[list.size()][]);
    }
}