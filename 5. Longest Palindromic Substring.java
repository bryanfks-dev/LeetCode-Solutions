class Solution {
    // Expand from center method
    int start = 0;
    int len = 0;

    private void expandChars(char[] s, int i, int j) {
        // Function to expand char from center
        // Itterate untill i fixed on the left, j fixed on the right, and char left and rigth matches
        while (i >= 0 && j < s.length && s[i] == s[j]) {
            i--;
            j++;
        }

        // Check if found substring is not the longest as new found substring
        if (len < j - i - 1) {
            len = j - i - 1;
            start = i + 1;
        }
    }

    public String longestPalindrome(String s) {
        // Convert string into array of chars
        char[] chars_s = s.toCharArray();

        int n = s.length();

        // Base case
        if (n < 2) {
            return s;
        }

        // Iterate untill end of array of chars
        for (int idx = 0; idx < n; idx++) {
            expandChars(chars_s, idx, idx);
            expandChars(chars_s, idx, idx + 1);
        }

        // Return the longest substring
        return s.substring(start, start + len);
    }
}