class Solution {
    private void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public void sortColors(int[] nums) {
        // Dutch National Flag Sorting Algorithm

        int low = 0, 
            mid = 0, 
            high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);

                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);

                high--;
            }
        }
    }
}