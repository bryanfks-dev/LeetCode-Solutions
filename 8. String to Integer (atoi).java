class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;

        int my_int = 0;

        int n = s.length();

        // Move idx pointer through all whitespaces
        int idx = 0;
        while (idx < n && s.charAt(idx) == ' ') idx++;
        
        // Check if there is '-' sign
        boolean is_neg = false;
        
        if (idx < n && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            is_neg = s.charAt(idx) == '-';

            idx++;
        }

        while (idx < n && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            char curr_ch = s.charAt(idx);

            // Check if current integer might bigger than 32-bit integer max or min value
            if (my_int > Integer.MAX_VALUE / 10 || (my_int == Integer.MAX_VALUE / 10 && curr_ch - (int)'0' > Integer.MAX_VALUE % 10)) {
                my_int = (is_neg) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

                break;
            }

            // Convert char into integer
            my_int = my_int * 10 + curr_ch - (int)'0';

            idx++;
        }

        return ((is_neg) ? -1 : 1) * my_int;
    }
}