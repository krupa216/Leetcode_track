// Last updated: 9/21/2026, 3:21:19 PM
class Solution {
    public int totalNumbers(int[] d) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                for(int k=0;k<d.length;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        if(d[i]!=0)
                        {
                            if(d[k]%2==0)
                            {
                                int n=d[i]*100+d[j]*10+d[k];
                                h.add(n);
                            }
                        }
                    }
                }
            }
        }
        return h.size();
    }
}