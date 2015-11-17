public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Arrays.sort(strs);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            String aftersort = sortHelper(strs[i]);
            if (map.containsKey(aftersort)) {
                map.get(aftersort).add(strs[i]);
            } else {
                List<String> temp  = new ArrayList<>();
                map.put(aftersort, temp);
                map.get(aftersort).add(strs[i]);
            }
        }
        
        for (List<String> subresult : map.values()) {
            result.add(subresult);
        }
        
        return result;
    }
    
    public String sortHelper(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String result = String.valueOf(c);
        return result;
    }
}