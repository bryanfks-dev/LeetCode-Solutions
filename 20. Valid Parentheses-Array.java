class Solution {
    public boolean isValid(String s) {
        // Create array to track openning bracket(s)
        char[] stack = new char[s.length()];

        // This index variable represent most top data in stack
        int idx = -1;

        // Iterate through all char(s) in string
        for (char c : s.toCharArray()) {
            // Push openning bracket(s) into array
            if (c == '(' || c == '{' || c == '[')
                stack[++idx] = c;
            // Is closed bracket(s)
            else {
                // Check if openning bracket is found
                if (idx >= 0 &&
                        ((stack[idx] == '(' && c == ')') ||
                                (stack[idx] == '{' && c == '}') ||
                                (stack[idx] == '[' && c == ']')))
                    idx--;
                else
                    return false;
            }
        }

        // If idx = -1, means array is empty which means all openning bracket and closed
        // bracket are matches
        return idx == -1;
    }
}