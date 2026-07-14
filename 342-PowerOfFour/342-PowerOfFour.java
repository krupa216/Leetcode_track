// Last updated: 7/14/2026, 2:03:05 PM
class Solution {
    public boolean isPowerOfFour(int n) {
   
        if (n <= 0)
         return false;
        while (n % 4 == 0) 
        {
            n /= 4;
        }
        if(n!=1)
        {
            return false;
        }
 
    return true;
    }
}