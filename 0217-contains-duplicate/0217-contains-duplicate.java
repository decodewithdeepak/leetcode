class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            if(set.contains(val)){
                return true;
            }
            set.add(val);
        }
        return false;
    }
}