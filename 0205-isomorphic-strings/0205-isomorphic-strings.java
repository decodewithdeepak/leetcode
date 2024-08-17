class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>(); 
        // Key: character from s, Value: character from t

        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if (map.containsKey(sCh)) { // check if sCh is already mapped
                if (map.get(sCh) != tCh) return false;
            } else if (map.containsValue(tCh)) { // check if tCh is already mapped
                return false;
            } else {
                map.put(sCh, tCh); // add mapping of sCh and tCh
            }
        }
        return true;
        // TC: O(n) | SC: O(1) - n is the length of the strings
    }
}
