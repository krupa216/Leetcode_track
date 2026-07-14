// Last updated: 7/14/2026, 2:01:26 PM
class Solution {
    public int mirrorDistance(int n) {
        int m=Math.abs(n);
        int res=0;
        while(m!=0)
        {
            int t=m%10;
            res=t+(res*10);
            m/=10;
        }
        return Math.abs(res-n);
    }
}