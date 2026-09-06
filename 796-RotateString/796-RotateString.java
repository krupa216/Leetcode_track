// Last updated: 9/6/2026, 4:27:43 PM
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