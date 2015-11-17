public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        int start = 0;
        int end = nums.length - 1;
        
        //find the first index
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] == target) {
            result[0] = start;
        } else if (nums[end] == target){
            result[0] = end;
        } else {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        
        start = 0;
        end = nums.length - 1;
        //find the last index
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[end] == target) {
            result[1] = end;
            return result;
        } else if (nums[start] == target){
            result[1] = start;
            return result;
        } 
        
        return result;
    }
}