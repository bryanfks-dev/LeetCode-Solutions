double myPow(double x, int n){
    // Use recursive method to find the power result
    if (x == 1 || n == 0) return 1;
    
    // Shorten power
    if (n % 2 == 0) {
        x *= x;
        n /= 2;
    }
    
    return (n < 0) ? myPow(x, n + 1) / x : x * myPow(x, n - 1);
}
