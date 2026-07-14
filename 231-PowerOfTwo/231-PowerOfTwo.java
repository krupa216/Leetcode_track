// Last updated: 7/14/2026, 2:03:28 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
     
       if(n<=0)
       {
        return false;
       }
      
        while(n%2==0)
        {
            n/=2;
        }
        if( n==1)
        {
        return true; 
        }
    return false;
    }
}