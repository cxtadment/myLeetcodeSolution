public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        
        int len = digits.length;
        int flag = 1;
        for (int i = len - 1; i >= 0; i--) {
            if ((digits[i] + flag) > 9) {
                digits[i] = 0;
                flag = 1;
            } else {
                digits[i] += flag;
                flag = 0;
                break;
            }
        }
        
        if (flag == 0) {
            return digits;
        } else {
            int[] newDigits = new int[len + 1];
            newDigits[0] = 1;
            return newDigits;
        }
    }
}