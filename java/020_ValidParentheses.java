public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() != map.get(s.charAt(i))) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}