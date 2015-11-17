public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word.length() == 0) {
            return true;
        }
        
        Character firstChar = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == firstChar) {
                    boolean flag = existHelper(board, word, i, j, 0);
                    if (flag) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean existHelper(char[][] board, String word, int i, int j, int count) {
        if (count == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
            return false;
        }
        board[i][j] = '/';
        boolean flag = existHelper(board, word, i + 1, j, count + 1) || 
                       existHelper(board, word, i - 1, j, count + 1) ||
                       existHelper(board, word, i, j + 1, count + 1) ||
                       existHelper(board, word, i, j - 1, count + 1);
        board[i][j] = word.charAt(count);
        return flag;
    }
}