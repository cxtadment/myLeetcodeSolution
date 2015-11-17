public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n == 0) {
            return result;
        }
        helper(result, n, n, "");
        return result;
    }
    
    public void helper(List<String> result, int left, int right, String subResult) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            result.add(subResult);
            return;
        }
        helper(result, left - 1, right, subResult + "(");
        helper(result, left, right - 1, subResult + ")");
    }
}