// Last updated: 7/14/2026, 2:01:39 PM
class Solution {
    public int numberOfSpecialChars(String s) {
        HashSet<Character> l=new HashSet<>();
           HashSet<Character> u=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                l.add(ch);
            }
            else{
                u.add(ch);
            }

        }
        int a=0;
        for(char ch:l)
        {
            if(u.contains(Character.toUpperCase(ch)))
            {
                a++;
            }
        }
        return a;
    }
}