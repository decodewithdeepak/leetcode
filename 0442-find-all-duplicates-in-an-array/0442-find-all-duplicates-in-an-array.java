class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> dup = new ArrayList<>();
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) dup.add(nums[i]);
        }
        return dup;
    }
}