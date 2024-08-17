class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0]; // take the first string as prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // reduce the prefix
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}