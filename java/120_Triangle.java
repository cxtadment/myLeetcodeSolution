public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //this method use extra space O(n^2)
        // if (triangle == null || triangle.size() == 0) {
        //     return 0;
        // }
        // int rows = triangle.size();
        // int[][] minSum = new int[rows][rows];
        // for (int i = 0; i < rows; i++) {
        //     minSum[rows - 1][i] = triangle.get(rows - 1).get(i);
        // }
        // for (int i = rows - 2; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         minSum[i][j] = Math.min(minSum[i + 1][j], minSum[i + 1][j + 1]) + triangle.get(i).get(j);
        //     }
        // }
        // return minSum[0][0];
        
        //this method use extra space o(n)
        int sz = trgl.size();
        int[] results = new int[sz+1];
    
        for(int i=sz-1; i>=0; i--) {
            List<Integer> tmp = trgl.get(i);
    
            for(int j=0; j<tmp.size(); j++) {
                results[j] = Math.min(results[j], results[j+1]) + tmp.get(j);
            }
        }
        return results[0];
    }
}