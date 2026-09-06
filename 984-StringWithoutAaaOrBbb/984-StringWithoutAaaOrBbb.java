// Last updated: 9/6/2026, 4:27:04 PM
class Solution {
    public String strWithout3a3b(int a, int b) {
        String s="";
        while(a>0 || b>0)
        {
       
         if(s.endsWith("aa"))
        {
               s+="b";
               b--;
        }
        else if(s.endsWith("bb"))
        {
            s+="a";
            a--;
        }
        else if(a>b)
        {
            s+="a";
            a--;
        }
        else
        {
         s+="b";
         b--;
        }
        }
    return s;
    }
}