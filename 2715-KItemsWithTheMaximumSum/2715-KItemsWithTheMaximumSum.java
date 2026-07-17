// Last updated: 7/17/2026, 3:14:21 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        int takeOnes = Math.min(numOnes, k);
        sum += takeOnes;
        k -= takeOnes;
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;
        sum -= k;
        return sum;
    }
}
