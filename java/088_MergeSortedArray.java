public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1; i >= 0; i--) {
            nums1[i + n] = nums1[i];
            System.out.println(nums1[i]);
        }
        int firstIndex = n > 0 ? n : 0;
        int secondIndex = 0;
        int index = 0;
        while (m > 0 && n > 0) {
            int firstNum = nums1[firstIndex];
            int secondNum = nums2[secondIndex];
            if (firstNum < secondNum) {
                nums1[index] = firstNum;
                index++;
                firstIndex++;
                m--;
            } else {
                nums1[index] = secondNum;
                index++;
                secondIndex++;
                n--;
            }
        }
        while (m > 0) {
            nums1[index++] = nums1[firstIndex++];
            m--;
        }
        while (n > 0) {
            nums1[index++] = nums2[secondIndex++];
            n--;
        }
    }
}