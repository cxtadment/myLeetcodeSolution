public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int mulLen = len1  + len2;
        int[] multiResult = new int[len1 + len2];
        
        for (int i = len1 - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            int k = len2 + i;
            for (int j = len2 - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int temp = multiResult[k] + n1 * n2;
                multiResult[k] = temp % 10;
                multiResult[k - 1] = multiResult[k - 1] + temp / 10;
                k--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < mulLen && multiResult[count] == 0) {
            count++;
        }
        for (int i = count; i < mulLen; i++) {
            sb.append(multiResult[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}