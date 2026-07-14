// Last updated: 7/14/2026, 2:03:38 PM
class Solution {
    public int hammingWeight(int n) {
        String s="";
        while(n!=0)
        {
            int t=n%2;
            s=t+s;
            n/=2;
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {
              if(s.charAt(i)=='1')
              {
                c++;
              }
        }
        return c;
    }
}