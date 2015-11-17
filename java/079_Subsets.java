public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        List<Integer> subResult = new ArrayList<>();
        subsetsHelper(result, subResult, nums, 0);
        return result;
    }
    
    public void subsetsHelper(List<List<Integer>> result, List<Integer> subResult, int[] nums, int index) {
        result.add(new ArrayList<Integer>(subResult));
        
        for (int i = index; i < nums.length; i++) {
            subResult.add(nums[i]);
            subsetsHelper(result, subResult, nums, i + 1);
            subResult.remove(subResult.size() - 1);
        }
    }
}