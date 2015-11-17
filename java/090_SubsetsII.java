public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        List<Integer> subResult = new ArrayList<Integer>();
        subsetsWithDupHelper(result, subResult, nums, 0);
        
        return result;
    }
    
    public void subsetsWithDupHelper(List<List<Integer>> result, List<Integer> subResult, int[] nums, int index) {
        if (index <= nums.length) {
            result.add(new ArrayList<Integer>(subResult));
        }
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            subResult.add(nums[i]);
            subsetsWithDupHelper(result, subResult, nums, i + 1);
            subResult.remove(subResult.size() - 1);
        }
    }
}