import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // handle single-element case
            if (n == 1) {
                list.add(nums[i]);
                break;
            }
            // check first element
            if (i == 0 && nums[i] + 1 < nums[i + 1]) {
                list.add(nums[i]);
            }
            // check last element
            else if (i == n - 1 && nums[i] - 1 > nums[i - 1]) {
                list.add(nums[i]);
            }
            // check middle elements
            else if (i > 0 && i < n - 1 && nums[i] - 1 > nums[i - 1] && nums[i] + 1 < nums[i + 1]) {
                list.add(nums[i]);
            }
        }
        
        return list;
    }
}
