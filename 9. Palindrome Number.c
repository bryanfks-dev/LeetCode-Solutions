bool isPalindrome(int x){
    // Check if number bigger or equal to 0
    if (x >= 0) {
        long y = 0;
        int z = x;
        
        // Reverse integer algorithm
        while (z) {
            y = y * 10 + z % 10;
            z /= 10;
        }
        
        return x == y;
    }

    return false;
}
