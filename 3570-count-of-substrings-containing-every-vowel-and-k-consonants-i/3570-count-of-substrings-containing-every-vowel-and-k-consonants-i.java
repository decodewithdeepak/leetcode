class Solution {
    public int countOfSubstrings(String word, int k) {
        // brute-foce => checking all substrings and then checking if it contains all vowels and k consonants
        // TC: O(n^2) | SC: O(1)
        int n = word.length();
        int count = 0;
        for(int i=0; i<n; i++){
            HashSet<Character> vowel = new HashSet<>();
            int consonants = 0;
            for(int j=i; j<n; j++){
                char c = word.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowel.add(c);
                else consonants++;
                if(vowel.size() == 5 && consonants == k) count++;
            }
        }
        return count;
    }
}
