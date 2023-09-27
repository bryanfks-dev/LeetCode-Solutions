class Solution {
    public int maxSubArray(int[] nums) {
        // Base case
        if (nums.length == 1)
            return nums[0];
        
        int sum = nums[0];
        int curr_sum = 0;

        // Iterate to all element in array
        for (int idx = 0; idx < nums.length; idx++) {
            curr_sum = Math.max(nums[idx], curr_sum + nums[idx]);

            sum = Math.max(sum, curr_sum);
        }

        return sum;
    }
}