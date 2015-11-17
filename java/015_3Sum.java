public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //use two pointer to solve this problem
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    List<Integer> subResult = new ArrayList<Integer>();
                    subResult.add(nums[i]);
                    subResult.add(nums[start]);
                    subResult.add(nums[end]);
                    result.add(subResult);
                    start++;
                    end--;
                    
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}