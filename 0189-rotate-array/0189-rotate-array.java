class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // to handle k > n
        reverse(nums, 0, n-1); // reverse whole array
        reverse(nums, 0, k-1); // reverse 1st part
        reverse(nums, k, n-1); // reverse 2nd part
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}