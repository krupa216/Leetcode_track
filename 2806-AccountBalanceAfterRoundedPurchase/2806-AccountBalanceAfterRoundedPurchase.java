// Last updated: 9/6/2026, 4:24:26 PM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int r=Math.round(p/10.0f)*10;
        return (100-r);
    }
}