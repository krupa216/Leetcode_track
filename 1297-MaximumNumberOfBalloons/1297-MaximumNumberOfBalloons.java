// Last updated: 7/14/2026, 2:02:24 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] c=new int[26];
        for(char ch:text.toCharArray())
        {
            c[ch-'a']++;
        }
        int min=Math.min(c['b'-'a'],c['a'-'a']);
        int min2=Math.min(c['o'-'a']/2,c['l'-'a']/2);
        int min3=Math.min(min2,c['n'-'a']);
        return Math.min(min,min3);
    }
}