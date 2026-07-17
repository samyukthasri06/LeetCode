// Last updated: 7/17/2026, 3:14:16 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        purchaseAmount += 5;
        purchaseAmount/=10;
        purchaseAmount *= 10;
        return 100-purchaseAmount ;
    }
}