class Solution {
    private final void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        // Base case
        if (nums.length == 1)
            return nums;

        int l = 0;
        int r = nums.length - 1;

        // The left side of the array should contains even numbers
        // and followed by odd numbers in the right side of the array
        while (l <= r) {
            // Move l untill find a even number
            while (l < r && nums[l] % 2 == 0)
                l++;
            
            // Move r untill find a odd number
            while (l < r && nums[r] % 2 == 1)
                r--;

            swap(nums, l, r);

            l++;
            r--;
        }

        return nums;
    }
}