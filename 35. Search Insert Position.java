class Solution {
    public int searchInsert(int[] nums, int target) {
        // Binary search algorithm
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            // Base case
            if (nums[mid] == target) return mid;
            // Shrink boundary
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        
        return left;
    }
}