// Last updated: 9/6/2026, 4:27:51 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++)
        {
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}