public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstSubResult = new ArrayList<Integer>();
        firstSubResult.add(1);
        result.add(firstSubResult);
        for (int i = 1; i < numRows; i++) {
            List<Integer> subResult = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                subResult.add(0);
            }
            List<Integer> preResult = result.get(i - 1);
            subResult.set(0, preResult.get(0));
            subResult.set(i, preResult.get(i - 1));
            for (int k = 1; k < i; k++) {
                subResult.set(k, preResult.get(k - 1) + preResult.get(k));
            }
            result.add(subResult);
        }
        return result;
    }
}