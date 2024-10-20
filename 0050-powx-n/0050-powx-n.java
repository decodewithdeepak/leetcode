class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1; // base case
        
        // recurrence relation :
        // if n is negative -> x^n = 1 / (x^n)
        // if n is even -> x^n = x^(n/2) * x^(n/2)
        // if n is odd -> x^n = x^(n/2) * x^(n/2) * x

        double smallPow = myPow(x, n / 2);
        if (n % 2 == 0) return smallPow * smallPow; // even n
        else if (n > 0) return smallPow * smallPow * x; // odd n
        else return smallPow * smallPow / x; // negative n
    }
}