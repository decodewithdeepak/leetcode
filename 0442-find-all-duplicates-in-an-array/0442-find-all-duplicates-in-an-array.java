class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Using Hashing - O(n) time, O(n) space
        List<Integer> dup = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.keySet()){
            if(map.get(num) == 2){
                dup.add(num);
            }
        }
        return dup;
    }
}