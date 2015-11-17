public class Solution {
    public List<Integer> getRow(int rowIndex) {
        //don't use recursion
        List<Integer> result = new ArrayList<Integer>();
        if (rowIndex < 0) {
            return result;
        }
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                temp.add(0);
            }
            temp.set(0, 1);
            temp.set(i, 1);
            for (int j = 1; j < i; j++) {
                temp.set(j, result.get(j - 1) + result.get(j));
            }
            result = temp;
        }
        return result;
    }
}