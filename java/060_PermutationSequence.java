public class Solution {
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        ArrayList<Integer> nums = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }
        
        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = (k - 1) / factorial[n - i - 1];
            k = (k - 1) % factorial[n - i - 1] + 1;
            
            perm[i] = nums.get(rank);
            nums.remove(nums.get(rank));
        }
        
        StringBuilder result = new StringBuilder();
        for (int digit : perm) {
            result.append(digit);
        }
        
        return result.toString();
    }
}