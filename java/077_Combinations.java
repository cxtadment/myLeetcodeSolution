public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n < 0 || n < k) {
            return result;
        }
        
        List<Integer> subResult = new ArrayList<Integer>();
        combineHelper(result, subResult, n, k, 1);
        
        return result;
    }
    
    public void combineHelper(List<List<Integer>> result, List<Integer> subResult, int n, int k, int index){
        if (subResult.size() == k) {
            result.add(new ArrayList<Integer>(subResult));
            return;
        }
        
        for (int i = index; i <= n; i++) {
            subResult.add(i);
            combineHelper(result, subResult, n, k, i + 1);
            subResult.remove(subResult.size() - 1);
        }
    }
}