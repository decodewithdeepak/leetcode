class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the break point
        int idx = -1; // index of break point
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        // If break point not exists then reverse the array
        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // Step 2: Find the next greater element and swap it with break point nums[idx]
        for(int i=n-1; i>idx; i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }

        // Step 3: Reverse the righthalf of array from idx+1 to n-1
        reverse(nums, idx+1, n-1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}