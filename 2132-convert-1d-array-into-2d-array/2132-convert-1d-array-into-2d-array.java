class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[0][0]; // invalid input

        int[][] result = new int[m][n]; // 2D array
        int idx=0; // index of original array

        for(int i=0;i<m;i++){ // rows
            for(int j=0;j<n;j++){ // columns
                result[i][j]=original[idx++]; // fill the 2D array
            }  
        }
        
        return result;
    }
}