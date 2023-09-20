class Solution {
    public int maxArea(int[] height) {
        int max_vol = 0;

        int left = 0, right = height.length - 1;

        while (left < right) {
            // Find the minimum vertical line
            int curr_h = Math.min(height[left], height[right]);

            max_vol = Math.max(max_vol, curr_h * (right - left));

            // Find the highest vertical lines
            while (left < right && height[left] <= curr_h)
                left++;
            while (left < right && height[right] <= curr_h) 
                right--;
        }

        return max_vol;
    }
}