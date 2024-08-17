class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sMap = new int[128]; // map to store the mapping of characters from s to t
        int[] tMap = new int[128]; // map to store the mapping of characters from t to s
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap[sChar] != tMap[tChar]) return false; // if the mapping is different
            sMap[sChar] = i + 1; // store the index of the character
            tMap[tChar] = i + 1; // store the index of the character
        }
        return true;
    }
}