// Last updated: 7/14/2026, 2:04:25 PM
class Solution {
    public int divide(int dividend, int divisor) {
     if(divisor==-1 && dividend==Integer.MIN_VALUE)  
     return Integer.MAX_VALUE;
       return (dividend/divisor);
    }
}