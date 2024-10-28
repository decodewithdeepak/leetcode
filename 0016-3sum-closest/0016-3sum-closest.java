class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for(int i=0; i<n-2; i++){
            int low = i+1;
            int high = n-1;

            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                // if sum matches target then return sum
                if(sum == target) return sum;
                // if sum is closer to target then update closestSum
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                // if sum is less than target then move low pointer
                if(sum < target) low++;
                // if sum is greater than target then move high pointer
                else high--;
            }
        }
        return closestSum;
    }
}