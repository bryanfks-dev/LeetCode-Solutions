class Solution {
    public int search(int[] nums, int target) {
        // In this problem, array is divided into 2 areas,
        // with same width (if the array length is even)
        // The numbers in the left area are bigger than
        // the numbers in the right area
        
        int l = 0;
        int r = nums.length - 1;
        
        while (l <= r) {
            int mid = (r + l) / 2;
            
            // Base case
            if (nums[mid] == target)
                return mid;

            // Target not found
            if (l == r)
                return -1;

            // l == mid, l in the last number in rotated array
            if (l == mid || nums[l] < nums[mid]) {
                // target < nums[mid], target less than last number in rotated array
                if (nums[l] <= target && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            // r == mid, r in the first number in rotated array
            else if (r == mid || nums[mid] < nums[r]) {
                // target <= nums[r], target less than or equal to first number 
                // in rotated array
                if (nums[mid] < target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }

        return -1;
    }
}