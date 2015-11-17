public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int start2 = j + 1;
                int end = nums.length - 1;
                while (start2 < end) {
                    int sum = nums[i] + nums[j] + nums[start2] + nums[end];
                    if (sum == target) {
                        List<Integer> subResult = new ArrayList<Integer>();
                        subResult.add(nums[i]);
                        subResult.add(nums[j]);
                        subResult.add(nums[start2]);
                        subResult.add(nums[end]);
                        result.add(subResult);
                        start2++;
                        end--;
                        
                        while (start2 < end && nums[start2] == nums[start2 - 1]) {
                            start2++;
                        }
                        while (start2 < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (sum < target) {
                        start2++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
}