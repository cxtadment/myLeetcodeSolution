public class Solution {
    public int reverse(int x) {
        //using this method either slove the 100 - > 001 case, or deal with negative case
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)result;
    }
}