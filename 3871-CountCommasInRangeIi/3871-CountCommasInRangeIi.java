// Last updated: 9/21/2026, 3:21:00 PM
class Solution {
    public long countCommas(long n) {
        long c=0;
        if(n<1000)
        {
            return c;
        }
        long s=1000;
        while(s<=n)
        {
            c+=n-s+1;
            s*=1000;
        }
        return c;

    }
}