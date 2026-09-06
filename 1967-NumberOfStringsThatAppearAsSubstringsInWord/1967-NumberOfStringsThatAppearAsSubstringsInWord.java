// Last updated: 9/6/2026, 4:25:06 PM
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