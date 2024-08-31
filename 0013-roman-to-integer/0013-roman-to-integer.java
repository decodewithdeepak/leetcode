class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
    
        for (int i = 0; i < n; i++) {
            int currVal = getValue(s.charAt(i));
            // next value is greater
            if (i < n - 1 && currVal < getValue(s.charAt(i + 1))) {
                sum -= currVal;
            }
            // next value is smaller or equal
            else {
                sum += currVal;
            }
        }
    
        return sum;
    }

    public int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000; // case 'M'
        }
    }
}