// Last updated: 9/6/2026, 4:24:17 PM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0; int l=0; int r=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='L')
            {
                l++;
            }
            else if(ch=='R')
            {
                r++;
            }
            else
            {
                c++;
            }
        }
        return Math.abs(l-r)+c;
    }
}