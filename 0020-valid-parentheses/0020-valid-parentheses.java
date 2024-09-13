class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // push opening brackets to stack
            if (c == '(' || c == '{' || c == '[')  st.push(c);
            // pop corresponding opening bracket if closing bracket is found at top
            else if (c == ')' && !st.isEmpty() && st.peek() == '(') st.pop();
            else if (c == '}' && !st.isEmpty() && st.peek() == '{') st.pop();
            else if (c == ']' && !st.isEmpty() && st.peek() == '[') st.pop();
            // closing bracket found at top but no corresponding opening bracket
            else return false;
        }
        // stack should be empty if all brackets are balanced
        return st.isEmpty();
    }

}