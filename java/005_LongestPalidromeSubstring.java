public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd number situation
            int len1 = palindromeHelper(s, i, i);
            //even number situation
            int len2 = palindromeHelper(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        String result = s.substring(start, end + 1);
        return result;
    }
    
    public int palindromeHelper(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}