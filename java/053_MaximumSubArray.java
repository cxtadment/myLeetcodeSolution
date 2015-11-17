public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int globalMaxSum = nums[0];
        int localMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localMaxSum = Math.max(localMaxSum + nums[i], nums[i]);
            globalMaxSum = Math.max(globalMaxSum, localMaxSum);
        }
        
        return globalMaxSum;
    }
}