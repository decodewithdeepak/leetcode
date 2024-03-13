class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Push opening brackets to stack
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // Pop closing brackets from stack if they match with top of stack
            else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } 
            else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } 
            else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } 
            // If closing bracket does not match with top of stack, return false
            else {
                return false;
            }
        }
        // If stack is empty at the end, return true
        return st.isEmpty();
    }

}