// Last updated: 7/14/2026, 2:04:12 PM
class Solution {
    public int[] plusOne(int[] d) {
        int n=d.length;
        for(int i=n-1; i>=0;i--)
        {
            if(d[i]<9)
            {
                d[i]++;
                return d;
            }
            d[i]=0;
        }
        int[] nn= new int[n+1];
        nn[0]=1;
        return nn;
    }
}