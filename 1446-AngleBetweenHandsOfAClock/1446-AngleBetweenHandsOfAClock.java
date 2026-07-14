// Last updated: 7/14/2026, 2:02:19 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double a=Math.abs((30*hour)-(5.5*minutes));
    
       if(a<=180)
       {
        return a;
       }
        return 360-a;
    }
}