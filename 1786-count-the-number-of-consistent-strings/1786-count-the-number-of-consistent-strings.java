class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        for (String word : words) {
            boolean flag = true;
            for (char ch : word.toCharArray()) {
                if (!allowed.contains(String.valueOf(ch))) {
                    flag = false;
                    break;
                }
            }
            if (flag) cnt++;
        }
        return cnt;
    }
}