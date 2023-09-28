class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // Base case
        if (words.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            String word = words[i];
             
            // Check if pattern already exists in map
            if (!map.containsKey(ch)) {
                // But the word already exist
                if (map.containsValue(word))
                    return false;

                // Word is not exist
                map.put(ch, word);
            }
            // Check the value with exist pattern
            else if (!map.get(ch).equals(word))
                return false;
        }

        return true;
    }
}