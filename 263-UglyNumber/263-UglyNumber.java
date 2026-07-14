// Last updated: 7/14/2026, 2:03:21 PM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        {
            return false;
        }
        int[] f={2,3,5};
        for(int i:f)
        {
            while(n%i==0)
            {
                n/=i;
            }
        }
        return n==1;
        
    }
}