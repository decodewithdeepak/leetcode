class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            
            if ((i == 0 || nums[i] - nums[i - 1] > 1) && (i == nums.length - 1 || nums[i + 1] - nums[i] > 1)) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
