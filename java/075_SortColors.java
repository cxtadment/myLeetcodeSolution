public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int startPointer = 0;
        int endPointer = nums.length - 1;
        
        for (int i = 0; i <= endPointer; i++) {
            if (nums[i] == 0) {
                int temp = nums[startPointer];
                nums[startPointer] = nums[i];
                nums[i] = temp;
                startPointer++;
            } else if (nums[i] == 2) {
                int temp = nums[endPointer];
                nums[endPointer] = nums[i];
                nums[i] = temp;
                endPointer--;
                i--;
            } else {
                continue;
            }
        }
    }
}