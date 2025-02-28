class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0, closeNeeded = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openNeeded++; // need a ) later
            } else {
                if (openNeeded > 0) {
                    openNeeded--; // pair with existing (
                } else {
                    closeNeeded++; // extra )
                }
            }
        }
        
        return openNeeded + closeNeeded;
    }
}
