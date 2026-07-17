// Last updated: 7/17/2026, 3:15:10 PM
class Solution {
    public boolean isPowerOfTwo(int n) {

        // Power of two must be positive
        if (n <= 0) {
            return false;
        }

        // Check if only one bit is set
        return (n & (n - 1)) == 0;
    }
}