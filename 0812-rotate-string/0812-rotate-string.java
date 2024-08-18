class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        // "abcde" + "abcde" = "abcdeabcde" contains "cdeab" as a substring.
        return (s + s).contains(goal);
    }
}