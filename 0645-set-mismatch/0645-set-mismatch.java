class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int rep = -1, mis = -1;

        //find the repeated number
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 2) {
                rep = nums[i];
                break;
            }
        }

        //find the missing number
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                mis = i;
                break;
            }
        }

        return new int[]{rep, mis};
    }
}