class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> lonelyNumbers = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        // count frequencies
        for (int num : nums) {
            // if present, increment count
            if (countMap.containsKey(num))
                countMap.put(num, countMap.get(num) + 1);
            // if not present, add it
            else
                countMap.put(num, 1);
        }

        // check lonely conditions
        for (int num : nums) {
            if (countMap.get(num) == 1 && !countMap.containsKey(num - 1) && !countMap.containsKey(num + 1)) {
                lonelyNumbers.add(num);
            }
        }

        return lonelyNumbers;
    }
}