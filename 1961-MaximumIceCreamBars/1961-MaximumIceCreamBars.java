// Last updated: 7/14/2026, 2:02:02 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int s=0;int c=0;
        for(int i=0;i<costs.length;i++)
        {
            if(coins<=0 || costs[i]>coins)
            {
                break;
            }
               c++;
               coins-=costs[i];
        }
        return c;
    }
}