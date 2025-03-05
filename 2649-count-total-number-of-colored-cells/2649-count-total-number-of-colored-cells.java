class Solution {
    public long coloredCells(int n) {
        // no of cells = 1+4+8+12+16+...
        //             = 4*(1+2+3+4+...+(n-1))+1

        // 1+2+3+4+...+(n-1) = ((n-1)*(n-1+1))/2 = ((n-1)*n)/2

        // no of cells = 2*((n-1)*n) + 1

        return 2L * (long)(n - 1) * (long)n + 1;
    }
}