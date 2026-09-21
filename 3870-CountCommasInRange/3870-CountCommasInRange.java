// Last updated: 9/21/2026, 3:20:55 PM
class Solution {
    public int countCommas(int n) {
       int c=0;
       for(int i=1;i<=n;i++)
       {
        if(i>=1000)
        {
            c++;
        }
       }
       return c;
    }
}