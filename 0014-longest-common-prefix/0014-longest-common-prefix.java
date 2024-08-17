class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // sort the array of strings
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // find the common prefix between the first and last string
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        return i == 0 ? "" : first.substring(0, i);
    }
}