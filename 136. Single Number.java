class Solution {
    public int singleNumber(int[] nums) {
        int same_num = 0;

        for (int idx = 0; idx < nums.length; idx++) {
            same_num ^= nums[idx];
        }

        return same_num;
    }
}