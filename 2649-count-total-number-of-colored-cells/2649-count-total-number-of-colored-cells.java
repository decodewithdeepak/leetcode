class Solution {
    public long coloredCells(int n) {
        // no of colored cells = 1+4+8+12+16+...
        //                     = 1 + 4*(1+2+3+4+...+(n-1))

        // 1+2+3+4+...+(n-1) = ((n-1)*(n-1+1))/2 = (n-1)*n/2

        return 1 + 4 * ((long) (n-1) * n / 2);
    }
}