public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] nums = new char[9];
            for (int j = 0; j < 9; j++) {
                nums[j] = board[i][j];
            }
            if (!isValid(nums)) {
                return false;
            }
        }
        
        for (int i = 0; i < 9; i++) {
            char[] nums = new char[9];
            for (int j = 0; j < 9; j++) {
                nums[j] = board[j][i];
            }
            if (!isValid(nums)) {
                return false;
            }
        }
        
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                char[] nums = new char[9];
                buildChar(nums, board, i, j);
                if (!isValid(nums)) {
                    return false;
                }
            }
            
        }
        
        return true;
    }
    
    public boolean isValid(char[] nums) {
        Set<Character> set = new HashSet<>();
        for (Character num : nums) {
            if (num == '.') {
                continue;
            }
            if (set.contains(num)) {
                return false;
            } else {
                set.add(num);
            }
        }
        return true;
    }
    
    public void buildChar(char[] nums, char[][] board, int i, int j) {
        nums[0] = board[i][j];
        nums[1] = board[i + 1][j];
        nums[2] = board[i + 2][j];
        nums[3] = board[i][j + 1];
        nums[4] = board[i + 1][j + 1];
        nums[5] = board[i + 2][j + 1];
        nums[6] = board[i][j + 2];
        nums[7] = board[i + 1][j + 2];
        nums[8] = board[i + 2][j + 2];
    }
}