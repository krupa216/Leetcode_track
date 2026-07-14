// Last updated: 7/14/2026, 2:03:00 PM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
        int c=0;
        boolean o=false;
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i:hm.values())
        {
            if(i%2==0)
            {
                c+=i;
            }
            else
            {
                c+=i-1;
                o=true;
            }
        }
        if(o)
        {
            return c+1;
        }
        return c;
    }
}