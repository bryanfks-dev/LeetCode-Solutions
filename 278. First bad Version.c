// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    // Binary Search algorithm
    long lowBound = 1,
        highBound = n;

    while (lowBound <= highBound) {
        long mid = (lowBound + highBound) / 2;

        bool isBad = isBadVersion(mid);
        if (isBad && !isBadVersion(mid - 1)) return mid;
        else if (isBad && isBadVersion(mid - 1)) highBound = mid - 1;
        else lowBound = mid + 1;
    }

    return -1;
}
