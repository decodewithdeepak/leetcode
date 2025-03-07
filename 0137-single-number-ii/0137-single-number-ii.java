import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        // check first element
        if(nums[0] != nums[1]) return nums[0];
        // check last element
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        for (int i = 0; i < n; i += 3) {
            if (nums[i+1] != nums[i]) {
                return nums[i];
            }
        }

        return -1;
    }
}