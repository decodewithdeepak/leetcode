class Solution {
    public String convertToTitle(int columnNumber) {
        // TC: O(logn) | SC: O(1) - n is the column number
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int rem = (columnNumber - 1) % 26; // get the remainder
            sb.append((char) (rem + 'A')); // convert remainder to character
            columnNumber = (columnNumber - 1) / 26; // update column number
        }
        return sb.reverse().toString();
    }
}