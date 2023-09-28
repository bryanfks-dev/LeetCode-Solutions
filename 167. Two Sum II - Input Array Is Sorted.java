class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // In this case, don't use hash map, because
        // we know that hash map has a faster look up 
        // time O(1), but this loop up line of code
        // should works n times as n is the length of the
        // array, so if we use hash map method our program
        // should has O(n) time complexity, despite binary search
        // should has O(log n), which is faster than O(n)

        int l = 0;
        int r = numbers.length - 1;

        while (l <= r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target)
                return new int[]{l + 1, r + 1};
            else if (sum > target)
                r--;
            else
                l++;
        }

        // Not found
        return new int[]{-1, -1};
    }
}