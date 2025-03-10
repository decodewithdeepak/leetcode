class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int len = 1; // window lemgth
        int count = 0; // alt groups count
        int prevCol = colors[0]; // previous color

        for (int i = 1; i < n + k - 1; i++){
            int idx = i % n; // handle circular index
            if (colors[idx] == prevCol) len = 1; // if same color appears reset window length
            else len++; // increase window length

            if (len >= k) count++; // count alt group

            prevCol = colors[idx]; // update prev color
        }

        return count;
    }
}