class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1; // base case

        // smaller subproblem
        double smallPow = myPow(x, n / 2);

        // if n is negative -> x^-n = 1 / x^n = (1 / x)^n
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        // if n is even -> x^n = x^(n/2) * x^(n/2)
        if (n % 2 == 0) return smallPow * smallPow;

        // if n is odd -> x^n = x^(n/2) * x^(n/2) * x
        else return smallPow * smallPow * x;
    }
}