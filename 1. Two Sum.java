class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create hash map
        Map<Integer, Integer> map = new HashMap();

        // Itterate through array element
        for (int idx = 0; idx < nums.length; idx++) {
            // Complement of target and current element
            int complement = target - nums[idx];

            // Check if complement exists in map
            if (map.containsKey(complement)) {
                // Return results
                return new int[] { map.get(complement), idx };
            }
            
            // Put element into map
            map.put(nums[idx], idx);
        }

        return new int[]{};
    }
}