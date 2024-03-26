class Solution {
    public boolean isAnagram(String s, String t) {
        // Using Sorting - TC: O(nlogn)
        // if (s.length() != t.length()) return false;
        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();
        // Arrays.sort(sArr);
        // Arrays.sort(tArr);
        // return Arrays.equals(sArr, tArr);

        // Using two HashMaps - O(n)
        // if (s.length() != t.length()) return false;
        // Map<Character, Integer> map1 = new HashMap<>();
        // Map<Character, Integer> map2 = new HashMap<>();
        // for (char c : s.toCharArray()) {
        //     if (map1.containsKey(c)) {
        //         map1.put(c, map1.get(c) + 1);
        //     } else {
        //         map1.put(c, 1);
        //     }
        // }
        // for (char c : t.toCharArray()) {
        //     if (map2.containsKey(c)) {
        //         map2.put(c, map2.get(c) + 1);
        //     } else {
        //         map2.put(c, 1);
        //     }
        // }
        // return map1.equals(map2);

        // Using one HashMap - O(n)
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) { // Increment frequency of character if present
                map.put(c, map.get(c) + 1);
            } else { // Add character to map with frequency 1 if not present
                map.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) { // Decrement frequency of character if present
                map.put(c, map.get(c) - 1); 
                if (map.get(c) == 0) { // Remove character if frequency becomes 0
                    map.remove(c);
                }
            } else { // Return false if character not present in map
                return false;
            }
        }
        return true;
    }
}