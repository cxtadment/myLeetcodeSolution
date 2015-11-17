public class Solution {
    public String countAndSay(int n) {
        if (n <= 0) {
            return null;
        } 
        String s = "1";
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    sb.append(count + "" + s.charAt(j));
                    count = 1;
                }
            }
            s = sb.toString();
        }
        
        return s;
    }
}