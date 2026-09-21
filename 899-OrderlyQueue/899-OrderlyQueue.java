// Last updated: 9/21/2026, 3:22:55 PM
class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1)
        {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
        }
      String res=s;
      for(int i=1;i<s.length();i++)
      {
        String r=s.substring(i)+s.substring(0,i);
        if(res.compareTo(r)>0)
        {
            res=r;
        }
      
      }
       return res;
    }
}