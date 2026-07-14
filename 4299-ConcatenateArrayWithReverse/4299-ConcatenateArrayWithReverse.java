// Last updated: 7/14/2026, 2:01:28 PM
class Solution {
    public int[] concatWithReverse(int[] n) {
        int[] a=new int[n.length*2];
        int t=0;
        for(int i=0;i<n.length;i++)
        {
            a[i]=n[i];
            t++;
        }
        for(int i=n.length-1;i>=0;i--)
        {
            a[t]=n[i];
            t++;
        }
        return a;
    }
}