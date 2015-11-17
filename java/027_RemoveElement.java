public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] == val) {
                nums[start] = nums[end];
                end--;
            } else {
                start++;
            }
        }
        //use end not start, to avoid [1]
        return end + 1;
    }
}