class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // TC: O(n*m*logm) | SC: O(n*m) - n is the number of strings and m is the length of the longest string
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr); // sort the characters of the string
            String key = new String(arr); // create a key from the sorted characters
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}