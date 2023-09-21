class Solution {
    public int maxDistance(int[] colors) {
        // Our approach is comparing the length value from left and right
        int n = colors.length;
        
        int left = colors[0];
        int right = colors[n - 1];
        
        int from_left = 0, from_right = 0;
        
        // Search length from left
        for (int curr = 0; curr < n; curr++)
            if (colors[curr] != left) from_left = curr;
        
        // Search length from right
        for (int curr = n - 1; curr >= 0; curr--)
            if (colors[curr] != right) from_right = (n - 1) - curr;
        
        return Math.max(from_left, from_right);
    }
}