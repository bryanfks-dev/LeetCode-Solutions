class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Create a hash map to keep tracking our visited char
        Map<Character, Integer> map = new HashMap();

        int start_idx = 0; 
        int max_len = 0; // This variable shows the longest substring

        for (int end_idx = 0; end_idx < s.length(); end_idx++) {
            char curr_char = s.charAt(end_idx);

            // Check if current char already exists inside map
            if (map.containsKey(curr_char)) {
                // Update start index
                start_idx = Math.max(start_idx, map.get(curr_char) + 1);
            }
            
            // Put char into map
            map.put(curr_char, end_idx);

            // Update max_len
            max_len = Math.max(max_len, end_idx - start_idx + 1);
        }

        return max_len;
    }
}