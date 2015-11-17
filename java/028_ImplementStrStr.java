public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int nlength = needle.length();
        int hlength = haystack.length();
        if (hlength < nlength) {
            return -1;
        }
        for (int i = 0; i <= hlength - nlength; i++) {
            String temp = haystack.substring(i, i + nlength);
            if (temp.equals(temp)) {
                return i;
            }
        }
        return -1;
    }
}