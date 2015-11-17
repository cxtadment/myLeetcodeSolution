public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] ss = s.split(" ");
        if (ss == null || ss.length == 0) {
            return 0;
        } else {
            char[] lastwords = ss[ss.length - 1].toCharArray();
            return lastwords.length;
        }
    }
}