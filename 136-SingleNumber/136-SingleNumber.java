// Last updated: 7/17/2026, 3:16:06 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            ans ^= n;
        }
        return ans;
    }
}
