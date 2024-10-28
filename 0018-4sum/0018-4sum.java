class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        // a+b+c+d = target => b+c+d = target-a => c+d = target-a-b = newTarget

        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue; // skip duplicate a
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue; // skip duplicate b
                int low = j+1;
                int high = nums.length-1;
                long newTarget = (long) target - nums[i] - nums[j];

                while(low < high){
                    int sum = nums[low] + nums[high];
                    if(sum == newTarget){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        res.add(list);

                        while(low < high && nums[low] == nums[low+1]) low++; // skip duplicate c
                        while(low < high && nums[high] == nums[high-1]) high--; // skip duplicate d

                        low++;
                        high--;
                    } else if(sum < newTarget){
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return res;
    }
}