public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums); 
        // so that we can appply two pointer technique and skip duplicates

        for (int i = 0; i < nums.length - 2; i++) {
            // a+b+c = 0 => b+c = -a = target
            if (i == 0 || nums[i] != nums[i - 1]) { // skip duplicate a
                int low = i + 1;
                int high = nums.length - 1;
                int target = -nums[i];

                while (low < high) {
                    int sum = nums[low] + nums[high];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        res.add(list);

                        // skip duplicate b
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        // skip duplicate c
                        while (low < high && nums[high] == nums[high - 1]) high--;

                        low++;
                        high--;
                    } else if (sum < target) {
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
