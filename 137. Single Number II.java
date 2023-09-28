class Solution {
    public int singleNumber(int[] nums) {
        // Create a hashmap to track numbers
        Map<Integer, Integer> map = new HashMap();

        // Push all elements into hashmap
        for (int num : nums) {
            // Put the value as how many number found in array
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // If the key value is 1 means, the number only appeared once in the array
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Not found
        return -1;
    }
}