// Last updated: 9/6/2026, 4:25:59 PM
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i<=s.length()-k;i++)
        {
            String db=s.substring(i,i+k);
            int n1=Integer.parseInt(db);
            if(n1!=0 && num%n1==0)
            {
   c++;
            }
        }
        return c;
    }
}