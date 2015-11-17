public class Solution {

    //Method 1
    public int numDecodings(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        //this method use constant space
        int n1 = 1, n2 = 1, n3 = 0;
        for (int i = 2; i <= s.length(); i++) {
            int num1Pre = s.charAt(i - 1) - '0';
            n3 = (num1Pre != 0) ? n1 : 0;
            int num2Pre = Integer.parseInt(s.substring(i - 2, i));
            n3 += (num2Pre >= 10 && num2Pre <= 26) ? n2 : 0;
            n2 = n1;
            n1 = n3;
            
        }
        
        return n1;
    }

    //Method 2
    public int numDecodings(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        //this method needs extra O(n) space
        int[] dp = new int[s.length() + 1];
        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            int num2Pre = Integer.parseInt(s.substring(i - 2, i));
            int step2Count = (num2Pre >= 10 && num2Pre <= 26) ? dp[i - 2] : 0;
            int num1Pre = s.charAt(i - 1) - '0';
            int step1Count = (num1Pre != 0) ? dp[i - 1] : 0;
            dp[i] = step1Count + step2Count;
        }
        
        return dp[s.length()];
    }
}