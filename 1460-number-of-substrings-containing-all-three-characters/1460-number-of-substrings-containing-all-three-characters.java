class Solution {
    public int numberOfSubstrings(String s) {
        // optimized solution - two pointers and sliding window - O(n)
        int n = s.length();
        int count = 0;
        int[] freq = new int[3]; // a b c
        int i = 0, j = 0;

        while(j < n){
            char c = s.charAt(j);
            freq[c - 'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                count += n - j;
                freq[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }
        return count;
    }
}