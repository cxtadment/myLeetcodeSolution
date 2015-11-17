public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean flagRow = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                flagRow = true;
                break;
            }
        }
        
        boolean flagCol = false;
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 0) {
                flagCol = true;
                break;
            }
        }
        for (int i = 1; i < rows; i++) {
             for (int j = 1; j < cols; j++) {
                 if (matrix[i][j] == 0) {
                     matrix[i][0] = 0;
                     matrix[0][j] = 0;
                 }
             }
         }
         
         for (int i = 1; i < rows; i++) {
             for (int j = 1; j < cols; j++) {
                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                     matrix[i][j] = 0;
                 }
             }
         }
         
         if (flagRow) {
             for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
             }
         }
         if (flagCol) {
             for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
             }
         }
    }
}