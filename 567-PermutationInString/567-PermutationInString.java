// Last updated: 9/6/2026, 4:28:27 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        {
            return false;
        }
        char[] c=s1.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<=m-n;i++)
        
        {
            String s=s2.substring(i,i+n);
            char[] su=s.toCharArray();
            Arrays.sort(su);
            if(Arrays.equals(c,su))
            
            {
                return true;
            }
        }
        return false;
    }
}