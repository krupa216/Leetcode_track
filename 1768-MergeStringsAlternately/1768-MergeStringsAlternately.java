// Last updated: 9/21/2026, 3:21:56 PM
class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0;
        int j=0;
        String r="";
        while(i<w1.length()||j<w2.length())
        {
            if(i<w1.length())
            {
            r+=w1.charAt(i);
            i++;
            }
            if(j<w2.length())
            {
             r+=w2.charAt(j);
             j++;
            }
        }

        
        return r;
    }
}