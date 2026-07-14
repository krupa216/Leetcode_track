// Last updated: 7/14/2026, 2:04:40 PM
class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int r=0;
        while(x>0)
        {
            int t=x%10;
            r=r*10+t;
            x/=10;
        }
        if(r==y)
        {
            return true;
        }
        return false;
    }
}