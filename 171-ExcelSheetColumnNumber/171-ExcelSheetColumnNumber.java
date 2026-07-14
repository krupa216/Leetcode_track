// Last updated: 7/14/2026, 2:03:41 PM
class Solution {
    public int titleToNumber(String c) {
        long a=0;
        for(int i=0;i<c.length();i++)
        {
            a=a*26+(c.charAt(i)-'A'+1);
        }
        return (int)a;
    }
}