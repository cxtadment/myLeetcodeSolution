public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = -1;
        while (true) {
            for (int i = 0; i < n; i++) {
                result.add(matrix[row][++col]);
            }
            if (--m == 0) break;
            
            for(int i = 0; i < m; i++) {
                result.add(matrix[++row][col]);
            }
            if(--n == 0) break;
            
            for(int i = 0; i < n; i++) {
                result.add(matrix[row][--col]);
            }
            if(--m == 0) break;
            
            for(int i = 0; i < m; i++) {
                result.add(matrix[--row][col]);
            }
            if(--n == 0) break;
        }
        return result;
    }
}