// Last updated: 7/27/2026, 2:26:32 PM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int r=Math.round(p/10.0f)*10;
        return (100-r);
    }
}