class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Using HashMap - O(n)
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                ans.add(key);
            }
        }
        return ans;
    }
}