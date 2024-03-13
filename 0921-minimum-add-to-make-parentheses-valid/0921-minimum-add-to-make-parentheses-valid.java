class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Push opening brackets to stack
            if (c == '(') {
                st.push(c);
            } 
            // Pop closing brackets from stack if they match with top of stack
            else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } 
            // If closing bracket does not match with top of stack, push it to stack
            else if (c == ')') {
                st.push(c);
            }
        }
        // Return the size of stack as it contains the minimum no. of brackets to be added
        return st.size();
    }
}