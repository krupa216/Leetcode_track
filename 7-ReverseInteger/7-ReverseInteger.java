// Last updated: 7/14/2026, 2:04:44 PM

class Solution {
    public int reverse(int n) {
        int res=0;
            while(n!=0)
            {
                 if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE /10)         
               {
                return 0;
            }
                int rem =n%10;
                
                res=(res*10)+rem;
                n=n/10;
      
            }
         
    return res;
    }
}