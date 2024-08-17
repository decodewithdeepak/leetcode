class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        // trim() removes leading and trailing whitespaces
        // split("\\s+") splits the string by one or more whitespaces
        // "\\s+" is a regex pattern that matches one or more whitespaces (spaces, tab, line break)
        // "\\s" is a regex pattern that matches a single whitespace character

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" "); // add space between words except for the last word
        }

        return reversed.toString();
    }
}