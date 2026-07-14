// Last updated: 7/14/2026, 2:03:24 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        {
            return true;
        }
        return false;
    }
}