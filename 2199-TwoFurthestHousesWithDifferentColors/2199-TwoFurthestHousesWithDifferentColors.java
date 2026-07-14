// Last updated: 7/14/2026, 2:01:59 PM
class Solution {
    public int maxDistance(int[] c) {
        int num=0;
        for(int i=0;i<c.length;i++)
        {
            for(int j=c.length-1;j>=0;j--)
            {
                if(c[i]!=c[j])
                {
                    num=Math.max(num,j-i);
                }
            }
        }
        return num;
    }
}