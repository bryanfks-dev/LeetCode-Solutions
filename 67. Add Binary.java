class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int ai = a.length() - 1;
        int bi = b.length() - 1;

        // sb is a variable to save the result
        StringBuilder sb = new StringBuilder();

        while (ai >= 0 || bi >= 0 || carry == 1) {
            if (ai >= 0)
                carry += a.charAt(ai--) - '0';
            
            if (bi >= 0)
                carry += b.charAt(bi--) - '0';

            // Why mod 2 or div by 2, because this is in binary world
            // or base 2 number, not a decimal number or base 10 number
            sb.append(carry % 2);

            carry /= 2;
        }

        return sb.reverse().toString();
    }
}