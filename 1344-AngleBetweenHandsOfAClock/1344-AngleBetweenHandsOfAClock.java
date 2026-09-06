// Last updated: 9/6/2026, 4:25:56 PM
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