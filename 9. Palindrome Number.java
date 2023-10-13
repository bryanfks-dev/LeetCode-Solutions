class Solution {
    public boolean isPalindrome(int x) {
        // Base case
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        if (x == Integer.MAX_VALUE)
            return false;

        int oldX = x;
        int newX = 0;

        // Construct palindrome
        while (oldX != 0) {
            newX = newX * 10 + oldX % 10;

            oldX /= 10;
        }

        return x == newX;
    }
}