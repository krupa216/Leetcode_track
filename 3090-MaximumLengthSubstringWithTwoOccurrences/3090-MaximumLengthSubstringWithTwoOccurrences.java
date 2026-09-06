// Last updated: 9/6/2026, 4:24:09 PM
class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;int j=0;int max=0;
        int[] f=new int[26];
        while(j<s.length())
        {
            char c=s.charAt(j);
            f[c-'a']++;
            while(f[c-'a']>2)
            {
                f[s.charAt(i)-'a']--;
                i++;
            }
            j++;
            max=Math.max(max,j-i);
        }
        return max;    }
}