class Solution {
    public String removeKdigits(String num, int k) {
        // keep smallest digits at the start
        // get rid of k largest digits

        int n = num.length();
        Stack<Character> st = new Stack<>();

        // remove k largest digits
        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // if k is still left, remove the largest digits from the end
        while (k > 0) {
            st.pop();
            k--;
        }

        // create the answer string
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        // reverse the string
        sb.reverse();

        // remove leading zeroes
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // if string is empty, return "0"
        if (sb.length() == 0) return "0";

        return sb.toString();
    }
}