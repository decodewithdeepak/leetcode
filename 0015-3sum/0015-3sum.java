public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            // a+b+c = 0 => b+c = -a
            // duplicate a
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                twoSumSorted(i+1, nums.length-1, nums, -nums[i], res);
            }
        }
        return res;
    }

    void twoSumSorted(int i, int j, int[] nums, int target, List<List<Integer>> res){
        int a1 = nums[i-1];
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum == target){
                List<Integer> list = new ArrayList<>();
                list.add(a1); list.add(nums[i]); list.add(nums[j]);
                res.add(list);

                i++; j--;
                
                // duplicate b
                while(i<j && nums[i] == nums[i-1]) i++;
                // duplicate c
                while(i<j && nums[j] == nums[j+1]) j--;
            } else if(sum < target){
                i++;
            } else {
                j--;
            }
        }
    }
}
