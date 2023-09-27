class Solution {
    // Expand from center method
    int start = 0;
    int len = 0;

    private void expandChars(char[] s, int i, int j) {
        while (i >= 0 && j < s.length && s[i] == s[j]) {
            i--;
            j++;
        }

        if (len < j - i - 1) {
            len = j - i - 1;
            start = i + 1;
        }
    }

    public String longestPalindrome(String s) {
        char[] chars_s = s.toCharArray();

        int n = s.length();

        // Base case
        if (n < 2) {
            return s;
        }

        for (int idx = 0; idx < n; idx++) {
            expandChars(chars_s, idx, idx);
            expandChars(chars_s, idx, idx + 1);
        }

        return s.substring(start, start + len);
    }
}