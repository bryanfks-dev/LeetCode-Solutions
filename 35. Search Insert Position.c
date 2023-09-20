int searchInsert(int* nums, int numsSize, int target){
    // Use binary search alogirthm
    int lowBound = 0, 
        highBound = numsSize - 1;

    while (lowBound <= highBound) {
        int mid = (lowBound + highBound) / 2;

        if (nums[mid] == target || (mid != 0 && nums[mid] > target && nums[mid - 1] < target)) {
            return mid;
        }
        else if (mid == numsSize - 1 && nums[mid] < target) return mid + 1;
        else if (nums[mid] > target) highBound = mid - 1;
        else lowBound = mid + 1;
    }

    return 0;
}
