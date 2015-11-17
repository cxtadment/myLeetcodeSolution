public class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int start = 0, end = height.length - 1;
        int result = 0;
        while (start < end) {
            result = Math.max(result, calculator(height, start, end));
            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }
    
    public int calculator(int[] height, int start, int end) {
        int h = Math.min(height[start], height[end]);
        return (end - start) * h;
    }
}