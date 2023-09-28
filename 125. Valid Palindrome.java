class Solution {
    public boolean isPalindrome(String s) {
        // Base case
        if (s.isEmpty())
            return true;

        // Two pointer method
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            // Move l untill find a letter or number
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                l++;

            // Move r untill find a letter or number
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                r--;
            
            char l_ch = s.charAt(l);
            char r_ch = s.charAt(r);

            if (l_ch >= 'A' && l_ch <= 'Z')
                l_ch = (char)(l_ch + 32);
            
            if (r_ch >= 'A' && r_ch <= 'Z')
                r_ch = (char)(r_ch + 32);

            // Check if letter in l and r are matches
            if (l_ch != r_ch)
                return false;

            l++;
            r--;
        }

        return true;
    }
}