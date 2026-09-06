// Last updated: 9/6/2026, 4:27:02 PM
class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                res+="1";

            }
            else
            {
                res+="0";
            }
          

        }
          int r=Integer.parseInt(res,2);
        return r;
    }
}