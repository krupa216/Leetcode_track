// Last updated: 7/14/2026, 2:02:56 PM
class Solution {
    public int countSegments(String s) {
        int c=0;
        if(s.equals(""))
        {
            return 0;
        }
 
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)!=' '&&(i==0 || s.charAt(i-1)==' '))
        
            c++;
            
        }
        return c;
    }
}