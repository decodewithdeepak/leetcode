class Solution {
    public void sortColors(int[] nums) {
        // O(n) approach - Dutch National Flag Algorithm
        // Rules-
        // [0, low-1] -> 0 (extreme left)
        // [low, mid-1] -> 1
        // [mid, high] -> 0/1/2 unsorted
        // [high+1, n-1] -> 2 (extreme right)
        
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            // 0 -> swap with low, low++, mid++
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            // 1 -> mid++
            else if(nums[mid] == 1){
                mid++;
            }
            // 2 -> swap with high, high--
            else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}