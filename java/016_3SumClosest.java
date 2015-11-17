public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        //pay attention to long 
        long closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                long sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return (int)sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                closestSum = Math.abs(sum - target) < Math.abs(closestSum - target) ? sum : closestSum;
            }
        }
        return (int)closestSum;
    }
}