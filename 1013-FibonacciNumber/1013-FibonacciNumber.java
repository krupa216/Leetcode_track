// Last updated: 7/14/2026, 2:02:36 PM
class Solution {
    public int fib(int n) {
        if(n<2)
        {
            return n;
        }
        int a=0;int b=1;int t=0;
        for(int i=2;i<=n;i++)
        {
        t=a+b;
        a=b;
        b=t;
    }
    return t;

    }


}