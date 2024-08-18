class Solution {
    public boolean isAnagram(String s, String t) {
        // Optimal Approach Using Frequency Array - TC: O(n) | SC: O(1)
        if (s.length() != t.length()) return false;
        int[] freq = new int[26]; // frequency array

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int f : freq) {
            if (f != 0) return false;
        }

        return true;
    }
}