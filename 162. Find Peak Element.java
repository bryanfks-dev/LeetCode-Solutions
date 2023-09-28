class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        // Find the biggest decreasing part
        while (l < r) {
            int mid = (r + l) / 2;

            // Decreasing part
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            }
            // Increasing part
            else {
                l = mid + 1;
            }
        }

        return l;
    }
}