class Solution {
    public void rotate(int[][] matrix) {
        int left = 0,
            right = matrix.length - 1;

        while (left < right) {
            for (int counter = 0; counter < right - left; counter++) {
                int top = left,
                    bottom = right;
                
                // Replace corner(s) algorithm
                int top_left_corner = matrix[top][left + counter];

                // The rotation is in clockwise direction
                matrix[top][left + counter] = matrix[bottom - counter][left];
                matrix[bottom - counter][left] = matrix[bottom][right - counter];
                matrix[bottom][right - counter] = matrix[top + counter][right];
                matrix[top + counter][right] = top_left_corner;
            }

            left++;
            right--;
        }
    }
}