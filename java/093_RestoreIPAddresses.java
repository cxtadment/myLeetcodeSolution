public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        List<String> list = new ArrayList<String>();
        restoreIpAddressesHelper(result, list, s, 0);
        
        return result;
    }
    
    public void restoreIpAddressesHelper(List<String> result, List<String> list, String s, int start) {
        if (list.size() == 4) {
            if (start < s.length()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String item : list) {
                sb.append(item);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            result.add(sb.toString());
            return;
        }
        
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String cut = s.substring(start, i + 1);
            if (isValid(cut)) {
                list.add(cut);
                restoreIpAddressesHelper(result, list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
    
    public boolean isValid(String cut) {
        if (cut.charAt(0) == '0') {
            return cut.equals("0");
        }
        int num = Integer.parseInt(cut);
        if (num > 0 && num < 256) {
            return true;
        } else {
            return false;
        }
    }
}