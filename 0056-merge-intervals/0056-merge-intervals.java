class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        int n = intervals.length;

        int[] prev = intervals[0];

        for(int i=1; i<n; i++) {
            if(prev[1]>=intervals[i][0]) {
                prev = new int[]{Math.min(prev[0], intervals[i][0]), Math.max(prev[1], intervals[i][1])};

            } else {
                res.add(prev);
                prev = intervals[i];
            }

        }

        res.add(prev);

        int[][] res1 = new int[res.size()][];

        for(int i=0; i<res.size(); i++) {
            res1[i] = res.get(i);
        }
        
        return res1;
    }
}