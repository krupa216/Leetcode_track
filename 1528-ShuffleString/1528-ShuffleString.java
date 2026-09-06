// Last updated: 9/6/2026, 4:25:31 PM
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