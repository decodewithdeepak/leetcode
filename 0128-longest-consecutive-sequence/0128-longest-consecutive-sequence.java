class Solution {
    public int longestConsecutive(int[] nums) {

        // Bruteforce Approach : Sort the array and find the longest consecutive sequence
        // Time Complexity : O(nlogn) + O(n) = O(nlogn)

        // Arrays.sort(nums);
        // int longestStreak = 1;
        // int currentStreak = 1;

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i - 1]) {
        //         if (nums[i] == nums[i - 1] + 1) {
        //             currentStreak ++;
        //         } else {
        //             longestStreak = Math.max(longestStreak, currentStreak);
        //             currentStreak = 1;
        //         }
        //     }
        // }

        // return Math.max(longestStreak, currentStreak);
        
        // Optimized Approach : Using HashSet
        // Time Complexity : O(n)

        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) hs.add(num);

        int longestStreak = 0;

        for (int num : nums) {
            if (!hs.contains(num - 1)) { // num is starting point of a sequence
                int currentNum = num;
                int currentStreak = 1;

                while (hs.contains(currentNum + 1)) {  // Check for next consecutive elements
                    currentStreak ++;
                    currentNum ++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;

    }
}