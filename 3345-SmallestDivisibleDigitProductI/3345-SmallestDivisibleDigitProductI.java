// Last updated: 8/16/2026, 5:39:11 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        if(n==0)
4        {
5            return 0;
6        }
7        long sum=0;
8        StringBuilder p=new StringBuilder();
9        while(n>0)
10        {
11            int d=n%10;
12            sum+=d;
13            if(d!=0)
14            {
15              p.append(d);
16
17            }
18            n/=10;
19        }
20        long s=Integer.valueOf(p.reverse().toString());
21        System.out.println(sum*s);
22    return sum*s;
23    }
24}