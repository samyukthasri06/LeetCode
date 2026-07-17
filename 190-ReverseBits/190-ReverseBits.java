// Last updated: 7/17/2026, 3:15:36 PM
public class Solution {
    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            result = result << 1;

            result = result | (n & 1);

            n = n >>> 1;
        }

        return result;
    }
}