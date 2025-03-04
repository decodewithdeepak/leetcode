class Solution {
    public boolean checkPowersOfThree(int n) {
        // convert n to base 3
        while (n > 0) {
            if (n % 3 == 2) {  // if any digit in base 3 is 2
                return false;
            }
            n /= 3;
        }
        return true;
    }
}