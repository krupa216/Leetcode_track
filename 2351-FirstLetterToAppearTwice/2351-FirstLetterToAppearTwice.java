// Last updated: 9/21/2026, 3:21:41 PM
class Solution {
    public char repeatedCharacter(String s) {
        int[] f=new int[26];
        char ch='a';
        for(int i=0;i<s.length();i++)
        {
              f[s.charAt(i)-'a']++;
            if(f[s.charAt(i)-'a']==2)
            {
               ch=s.charAt(i);
           break;
            }
          

        }
        return ch;
    }
}