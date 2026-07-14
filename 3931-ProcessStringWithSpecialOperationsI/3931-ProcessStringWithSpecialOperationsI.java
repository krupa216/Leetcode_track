// Last updated: 7/14/2026, 2:01:29 PM
class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                res=res.append(ch);
            }
            if(ch=='#')
            {
                if(res.length()>0)
                {
                // char c=res.charAt(res.length()-1);
               res= res.append(res.toString());
                }
            }
             if(ch=='%')
            {
                
               res= res.reverse();
            }
            if(ch=='*')
            {
                if(res.length()>0)
               res.deleteCharAt(res.length()-1);
            }
         
        }
        return res.toString();
    }
}