class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        // Key - Character from s, Value - Character from t
        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (map.containsKey(sch)) {
                if (map.get(sch) != tch) return false;
            } 
            else {
                if (map.containsValue(tch)) return false;
                map.put(sch, tch);
            }
        }
        return true;
    }
}