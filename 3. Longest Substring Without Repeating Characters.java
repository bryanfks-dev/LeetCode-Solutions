class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();

        int i = 0;
        int max_len = 0;

        for (int j = 0; j < s.length(); j++) {
            // Get char from string
            char curr_char = s.charAt(j);

            // Check if char already in map
            if (map.containsKey(curr_char)) {
                i = Math.max(i, map.get(curr_char) + 1);
            }

            // Append char to map
            map.put(curr_char, j);

            // Decide max len
            max_len = Math.max(max_len, j - i + 1);
        }

        return max_len;
    }
}