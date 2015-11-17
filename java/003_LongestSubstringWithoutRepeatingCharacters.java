public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int leftPointer = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int index = map.get(s.charAt(i));
                if (index >= leftPointer) {
                    leftPointer = index + 1;
                }
            }
            map.put(s.charAt(i), i);
            result = Math.max(result, i - leftPointer + 1);
        }
        return result;
    }
}