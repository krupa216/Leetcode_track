// Last updated: 10/14/2026, 2:41:21 PM
1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if(sum > (num*9) || sum<1)
4        {
5            return "";
6        }
7
8        StringBuilder res=new StringBuilder();
9        int r=sum;
10        for(int i=0;i<num;i++)
11        {
12            int d=Math.min(9,r);
13            res.append(d);
14            r-=d;
15        }
16        return res.toString();
17    }
18}