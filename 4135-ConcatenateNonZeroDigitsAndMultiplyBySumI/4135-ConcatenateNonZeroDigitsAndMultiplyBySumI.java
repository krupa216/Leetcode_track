// Last updated: 8/29/2026, 8:45:17 PM
class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)
        {
            return 0;
        }
        long sum=0;
        StringBuilder p=new StringBuilder();
        while(n>0)
        {
            int d=n%10;
            sum+=d;
            if(d!=0)
            {
              p.append(d);

            }
            n/=10;
        }
        long s=Integer.valueOf(p.reverse().toString());
        System.out.println(sum*s);
    return sum*s;
    }
}