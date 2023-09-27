class Solution {
    // Create hashmap to save char(s) for each number
    Map<Character, String> phone_num = new HashMap();

    // Create list to save all possible combination of number
    List<String> list = new ArrayList();

    // Create a string builder
    StringBuilder curr_comb = new StringBuilder();

    private void generateComb(String digits, int idx) {
        // Function to evaluate and make combination of inputted phone number
        // Base case
        if (idx == digits.length()) {
            // Add string into list
            list.add(curr_comb.toString());
            return;
        }

        // Check if digit is exists in map
        String str_in_phone_num = phone_num.get(digits.charAt(idx));

        for (int i = 0; i < str_in_phone_num.length(); i++) {
            // Append char into string
            curr_comb.append(str_in_phone_num.charAt(i));

            // Procceed next digit character
            generateComb(digits, idx + 1);

            // Delete current combination string last char, to 
            // add another possible char
            curr_comb.deleteCharAt(curr_comb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        // Base case
        if (digits.length() == 0)
            return list;
    
        // Put phone number and char(s) into map
        phone_num.put('2', "abc");
        phone_num.put('3', "def");
        phone_num.put('4', "ghi");
        phone_num.put('5', "jkl");
        phone_num.put('6', "mno");
        phone_num.put('7', "pqrs");
        phone_num.put('8', "tuv");
        phone_num.put('9', "wxyz");

        generateComb(digits, 0);

        // Return all possible combination of phone number
        return list;
    }
}