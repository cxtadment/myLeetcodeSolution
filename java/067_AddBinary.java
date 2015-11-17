public class Solution {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int numA = (i < 0) ? 0 : a.charAt(i) - '0';
            int numB = (j < 0) ? 0 : b.charAt(j) - '0';
            
            int num = (numA + numB + flag) % 2;
            flag = (numA + numB + flag) / 2;
            sb.insert(0, num);
        }
    
        if (flag == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
        
    }
}