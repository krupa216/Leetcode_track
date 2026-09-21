// Last updated: 9/21/2026, 3:22:53 PM
class Solution {
    public int totalFruit(int[] f) {
      Map<Integer, Integer> b=new HashMap<>();
      int j=0;
      int i=0;
      int res=0;
      for(i=0;i<f.length;i++)
      {
        b.put(f[i],b.getOrDefault(f[i],0)+1);
        while(b.size()>2)
        {
            b.put(f[j],b.get(f[j])-1);
            b.remove(f[j],0);
            j++;
        }
        res=Math.max(res,i-j+1);
      } 
      return res;

    }
}