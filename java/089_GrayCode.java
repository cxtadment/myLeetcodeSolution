public class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> subResult = new ArrayList<Integer>();
            subResult.add(0);
            return subResult;
        }
        //use recursion to get result
        List<Integer> result = grayCode(n - 1);
        int plusNum = 1 << n - 1;
        int size = result.size();
        //actually, gray code is a mirror effect, than put 1 in the first position 
        for (int i = size - 1; i >= 0; i--) {
            int newNum = (result.get(i) | plusNum);
            result.add(newNum);
        }
        return result;
    }
}