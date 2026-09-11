// Last updated: 9/11/2026, 11:54:04 AM
1class Solution {
2    public int totalFruit(int[] f) {
3      Map<Integer, Integer> b=new HashMap<>();
4      int j=0;
5      int i=0;
6      int res=0;
7      for(i=0;i<f.length;i++)
8      {
9        b.put(f[i],b.getOrDefault(f[i],0)+1);
10        while(b.size()>2)
11        {
12            b.put(f[j],b.get(f[j])-1);
13            b.remove(f[j],0);
14            j++;
15        }
16        res=Math.max(res,i-j+1);
17      } 
18      return res;
19
20    }
21}