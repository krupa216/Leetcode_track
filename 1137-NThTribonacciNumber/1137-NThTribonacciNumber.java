// Last updated: 9/6/2026, 4:26:30 PM
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