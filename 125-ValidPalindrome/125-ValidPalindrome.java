// Last updated: 7/14/2026, 2:03:53 PM
class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.replaceAll(" ","").toLowerCase();
        String rev="";
        String res="";
        for(int i=s2.length()-1;i>=0;i--)
        {
            if(s2.charAt(i)>=97 && s2.charAt(i)<=122 ||s2.charAt(i)>=48 &&s2.charAt(i)<=57 )
            rev=rev+s2.charAt(i);
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)>=97 &&s2.charAt(i)<=122 || s2.charAt(i)>=48 &&s2.charAt(i)<=57 )
            res=res+s2.charAt(i);
        }
        System.out.println(res);
        System.out.println(rev);
        if(s2.isEmpty())
        return true;
        if(res.equals(rev))
        return true;
        return  false;
    }
}