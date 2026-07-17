// Last updated: 7/17/2026, 3:15:30 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        while (left < right) {
            left = left >> 1;
            right = right >> 1;
            shift++;
        }

        return left << shift;
    }
}