class Solution {
    public int maxDepth(String s) {
        // Approach Using Stack - TC: O(n) | SC: O(n)
        int maxDepth = 0;
        int open = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
                maxDepth = Math.max(maxDepth, open);
            } else if (ch == ')') {
                open--;
            }
        }
        return maxDepth;
    }
}