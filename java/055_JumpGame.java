public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int maxIndex = 0;
        int len = nums.length - 1;
        for (int i = 0; i <= maxIndex; i++) {
            if (maxIndex >= len) {
                return true;
            }
            maxIndex = Math.max(maxIndex, nums[i] + i);
        }
        
        return false;
    }
}