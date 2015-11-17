public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int[] visited = new int[nums.length];
        List<Integer> subresult = new ArrayList<>();
        permuteHelper(result, subresult, nums, visited);
        
        return result;
    }
    
    public void permuteHelper(List<List<Integer>> result, List<Integer> subresult, int[] nums, int[] visited) {
        if (subresult.size() == nums.length) {
            result.add(new ArrayList<Integer>(subresult));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            subresult.add(nums[i]);
            permuteHelper(result, subresult, nums, visited);
            subresult.remove(subresult.size() - 1);
            visited[i] = 0;
        }
    }
}