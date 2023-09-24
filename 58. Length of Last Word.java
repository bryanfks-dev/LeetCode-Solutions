class Solution {
    public int lengthOfLastWord(String s) {
        int counter = 0;

        for (int idx = s.length() - 1; idx >= 0; idx--) {
            char curr_ch = s.charAt(idx);

            // Check if current char is whitespace
            if (curr_ch == ' ') {
                // Check again if counter is 0, means whitespace at behind the last substring
                if (counter == 0)
                    continue;
                
                break;
            }

            counter++;
        }

        return counter;

        /* Using split
         * String[] split_s = s.split(" ");
         * 
         * return split_s[split_s.length - 1].length();
         */
    }
}