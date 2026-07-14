// Last updated: 7/14/2026, 2:04:48 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
      String l="";
      String cu="";

      for(int i=0;i<s.length();i++)
      {
        if(cu.contains(String.valueOf(s.charAt(i))))
        {
           int index=cu.indexOf(s.charAt(i));
           cu=cu.substring(index+1);
        }
        cu=cu+s.charAt(i);
        if(cu.length()>l.length())
        {
            l=cu;
        }
      }
      int c=l.length();
      return c;
    }
}