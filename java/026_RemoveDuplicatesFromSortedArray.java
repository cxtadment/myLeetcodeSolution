public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int firstPointer = 0;
        int dup = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == dup) {
                continue;
            } else {
                dup = nums[i];
                nums[++firstPointer] = nums[i];
            }
        }
        return firstPointer + 1;
    }
}