public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i + 1;
                result[1] = map.get(target - nums[i]) + 1;
            } else {
                map.put(nums[i], i);
            }
        }
        Arrays.sort(result);
        return result;
    }
}