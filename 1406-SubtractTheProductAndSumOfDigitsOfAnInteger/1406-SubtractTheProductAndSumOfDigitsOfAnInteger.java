// Last updated: 7/17/2026, 3:14:31 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
