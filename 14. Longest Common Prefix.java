class Solution {
    public String longestCommonPrefix(String[] strs) {
        String long_prefix = strs[0]; // Select first string as a longest prefix
        
        // Search for the longest prefix in all strings
        for (int idx = 1; idx < strs.length; idx++) {
            // Find the longest prefix
            while (strs[idx].indexOf(long_prefix) != 0) {
                // Decrease string length untill find the prefix
                long_prefix = long_prefix.substring(0, long_prefix.length() - 1);
            }
            
            // Check if prefix is empty after loop once
            if (long_prefix.isEmpty()) break;
        }

        return long_prefix;
    }
}