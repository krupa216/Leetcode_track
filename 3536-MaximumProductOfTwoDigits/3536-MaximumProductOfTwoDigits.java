// Last updated: 9/6/2026, 4:23:55 PM
class Solution {
    public int maxProduct(int n) {
        int max=0;int smax=0;
        int m=n;
        while(m>0)
        {
            int d=m%10;
            if(d>max)
            {
                smax=max;
                max=d;
            }
       
           else if(d>smax)
            {
                smax=d;
            }
            m/=10;
        }
        return max*smax;
    }
}