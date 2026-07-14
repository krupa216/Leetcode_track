// Last updated: 7/14/2026, 2:01:20 PM
class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int n= lst.length;
        int m=wst.length;
        int res=10001;
         for(int i=0;i<n;i++)
        {
             for(int j=0;j<m;j++)
        {
             int lre=lst[i]+ld[i];
             int l=Math.max(lre,wst[j])+wd[j];
             res=Math.min(res,l);

             int wre=wst[j]+wd[j];
             int wl=Math.max(wre,lst[i])+ld[i];
             res =Math.min(res ,wl);
        }
        }
        return res;
    }
}