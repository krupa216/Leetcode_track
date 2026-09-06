// Last updated: 9/6/2026, 4:25:23 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int h=0;
        for(int i=0;i<gain.length;i++)
        {
           h+=gain[i];
           max=Math.max(max,h);
        }
        return max;

    }
}