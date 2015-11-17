public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        long reverse = 0;
        int tempx = x;
        while (tempx != 0) {
            reverse = reverse * 10 + tempx % 10;
            tempx = tempx /10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return false;
        }
        return reverse == x;
    }
}