class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        // if only one element
        if (n==1) return nums[0];
        // check first element
        if (nums[0] != nums[1]) return nums[0];
        // check last element
        if (nums[n-1] != nums[n-2]) return nums[n-1];

        // check triplets
        for (int i=0; i<n; i+=3) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return -1;
    }
}