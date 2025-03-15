class Solution {
    public int countPrimes(int n) {
        // Sieve of Eratosthenes (O(n log log n))
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // mark multiples as non-prime
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        
        return count;
    }
}
