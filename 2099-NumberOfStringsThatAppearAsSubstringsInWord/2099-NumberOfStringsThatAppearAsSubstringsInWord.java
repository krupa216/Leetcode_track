// Last updated: 7/14/2026, 2:02:00 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns)
        {
            if(word.contains(s))
            {
                c++;
            }
        }
        return c;
    }
}