public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> subresult = new ArrayList<Integer>();
        combinationSumHelper(result, subresult, 0, candidates, target);
        
        return result;
    }
    
    public void combinationSumHelper(List<List<Integer>> result, List<Integer> subresult, int start, int[] candidates, int target) {
        if (target == 0) {
            if (!result.contains(subresult)) {
                result.add(new ArrayList<Integer>(subresult));
                return;
            }
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            } else {
                subresult.add(candidates[i]);
                combinationSumHelper(result, subresult, i + 1, candidates, target - candidates[i]);
                subresult.remove(subresult.size() - 1);
            }
        }
    }
}