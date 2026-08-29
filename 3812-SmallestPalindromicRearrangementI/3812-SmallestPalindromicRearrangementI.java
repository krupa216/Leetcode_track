// Last updated: 8/29/2026, 8:45:41 PM
class Solution {
    public String smallestPalindrome(String s) {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
        }
        String l="";
        String m="";
        for(int i=0;i<26;i++)
        {
            while(f[i]>=2)
            {
              l+=(char)(i+'a');
              f[i]-=2;
            }

            if(f[i]==1)
            {
                m+=(char)(i+'a');
            }
        }
        String r=new StringBuilder(l).reverse().toString();
        return l+m+r;
    }
}