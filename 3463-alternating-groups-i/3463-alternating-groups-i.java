class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int prev = (i - 1 + n) % n; // circular previous index
            int next = (i + 1) % n; // circular next index
            
            // check if i forms an alt group
            if (colors[i] != colors[prev] && colors[i] != colors[next]) {
                count++;
            }
        }

        return count;
    }
}