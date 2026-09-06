// Last updated: 9/6/2026, 4:28:38 PM
class Solution {
    public String reverseWords(String s) {
        String[] st=s.split(" ");
        String t="";
        for(int i=0;i<st.length;i++)
        {
            StringBuilder sb=new StringBuilder(st[i]);
            t+=sb.reverse();
            if(i<st.length-1)
            {
                t+=" ";
            }
        }
        return t;
    }
}