public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        // from end, find the first elment that nums[i - 1] < nums[i]
        int i = nums.length - 1;
        for (; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                i--;
                break;
            }
        }
        
        //from end, find teh first element > nums[i]
        for (int j = nums.length - 1; j > i; j--) {
            if (nums[j] > nums[i]) {
                //交换 i, j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                reverse(nums, i + 1, nums.length - 1);
                return;
            }
        }
        
        reverse(nums, 0, nums.length - 1);
        return;
    }
    
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}