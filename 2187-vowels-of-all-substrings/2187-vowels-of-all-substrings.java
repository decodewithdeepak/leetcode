class Solution {
    public long countVowels(String word) {
        // optimized O(n) solution - combinatorics
        int n = word.length();
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (isVowel(word.charAt(i))) {
                // no of choices = i+1 for starting index and n-i for ending index
                count += (long) (i + 1) * (n - i);
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
