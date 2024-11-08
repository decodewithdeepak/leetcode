class Solution {
    public String decodeString(String s) {
        
        // create two stacks to store the numbers and strings
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        StringBuilder str = new StringBuilder(); // to store the decoded string
        int num = 0; // to store the number of repetitions

        for (char c : s.toCharArray()) {
            // 4 types of characters: digit, [, ], alphabet

            // if digit
            if (c >= '0' && c <= '9') { // Character.isDigit(c)
                // update the number and handle multiple digits
                num = num * 10 + c - '0'; // c - '0' converts char to int
            } 

            // if [
            else if (c == '[') {
                // push number and string to the stacks
                numStack.push(num);
                strStack.push(str.toString());
                // reset the number and string
                num = 0;
                str = new StringBuilder();
            }
            // if ]
            else if (c == ']') {
                // pop the number and string from the stacks
                int repeat = numStack.pop();
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < repeat; i++) {
                    temp.append(str);
                }
                // append the repeated string to the previous string
                str = new StringBuilder(strStack.pop() + temp);
            } 
            // if alphabet
            else {
                // append the alphabet to string
                str.append(c);
            }
        }

        return str.toString();
    }
}