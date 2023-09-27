class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Replace from back
        int n1 = m - 1;
        int n2 = n - 1;

        int nMerge = m + n - 1;

        while (n2 >= 0) {
            // Replace nums1 elements
            if (n1 >= 0 && nums1[n1] > nums2[n2])
                nums1[nMerge--] = nums1[n1--];
            else
                nums1[nMerge--] = nums2[n2--];
        }
    }
}