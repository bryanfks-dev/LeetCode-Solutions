class Solution {
    // Stack method(prefix)
    public boolean isValid(String s) {
        // Create stack to keep track of opening bracket(s)
        Stack<Character> stack = new Stack<Character>();

        // Loop through all chars in array of char from string
        for (char c : s.toCharArray()) {
            // Push to stack if found open bracket
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Found close bracket
            else {
                // Check if stack is empty
                if (stack.isEmpty())
                    return false;
                
                // Get the most top char from stack
                char top = stack.peek();

                // Remove the most top char in stack if matches
                if ((c == ')' && top == '(') || 
                    (c == ']' && top == '[') || 
                    (c == '}' && top == '{')) {
                    stack.pop();
                }
                // If bracket is not match
                else return false;
            }
        }

        // Return check stack is empty is valid here, because if the string through
        // above algorithm and passed untill this point, stack should be empty which means
        // all closed bracket(s) found matches openning bracket
        return stack.isEmpty();
    }
}