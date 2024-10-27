class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Using Two Pointers - O(n) time, O(1) space
        int i = 0;
        int j = numbers.length - 1;

        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target) return new int[] {i+1, j+1}; // 1-based index
            if (sum<target) i++;
            else j--;
        }

        return null;
    }
}