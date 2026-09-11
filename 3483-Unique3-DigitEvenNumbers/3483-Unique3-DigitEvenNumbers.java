// Last updated: 9/11/2026, 9:14:40 AM
1class Solution {
2    public int totalNumbers(int[] d) {
3        HashSet<Integer> h=new HashSet<>();
4        for(int i=0;i<d.length;i++)
5        {
6            for(int j=0;j<d.length;j++)
7            {
8                for(int k=0;k<d.length;k++)
9                {
10                    if(i!=j && i!=k && j!=k)
11                    {
12                        if(d[i]!=0)
13                        {
14                            if(d[k]%2==0)
15                            {
16                                int n=d[i]*100+d[j]*10+d[k];
17                                h.add(n);
18                            }
19                        }
20                    }
21                }
22            }
23        }
24        return h.size();
25    }
26}