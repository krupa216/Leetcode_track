// Last updated: 9/21/2026, 3:59:32 PM
class Solution {
    public int maxProduct(int[] n) {
        int max=n[0];
        int min=n[0];
        int res=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(n[i]<0)
            {
                int t=max;
                max=min;
                min=t;
            }
            max=Math.max(n[i],max*n[i]);
            min=Math.min(n[i],min*n[i]);
            res=Math.max(res,max);
        }
        return res;
    }
}