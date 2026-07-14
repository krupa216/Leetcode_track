// Last updated: 7/14/2026, 2:02:39 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        String s1=s+s;
        
        if(s1.contains(goal))
        {
            return true;
        }
        return false;
        
    }
}