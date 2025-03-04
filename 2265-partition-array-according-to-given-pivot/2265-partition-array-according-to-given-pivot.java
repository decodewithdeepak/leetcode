class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;
        
        // add elements < pivot
        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }
        
        // add elements == pivot
        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }
        
        // add elements > pivot
        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }
        
        return result;
    }
}
