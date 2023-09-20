int reverse(int x){
    long temp = x;
    long reverse = 0;

    // Reverse number algorithm
    while (temp) {
        reverse = reverse * 10 + temp % 10;
        temp /= 10;
    }

    // Check if the reverse result of x go outside signed 32-bit range
    if (reverse < -pow(2, 31) || reverse > pow(2, 31) - 1) return 0;

    return reverse;
}
