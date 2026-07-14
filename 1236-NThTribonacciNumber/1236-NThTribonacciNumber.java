// Last updated: 7/14/2026, 2:02:26 PM
class Solution {
    public int tribonacci(int n) {
       
        if(n<2)
        {
            return n;
        }
        int a=0;
        int b=1;
        int c=1;
int t=0;
        for(int i=3;i<=n;i++)
        {
            t =a+b+c;
           a=b;
           b=c;
           c=t;
        }
        return c;
    }
}