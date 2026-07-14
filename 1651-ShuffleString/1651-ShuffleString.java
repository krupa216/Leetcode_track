// Last updated: 7/14/2026, 2:02:11 PM
class Solution 
{
    public String restoreString(String s, int[] ind) {
        char[] c=new char[s.length()];
        for(int i=0;i<ind.length;i++)
        {
           c[ind[i]]=s.charAt(i);
        }
        String v=new String(c);
        return v;
    }
}