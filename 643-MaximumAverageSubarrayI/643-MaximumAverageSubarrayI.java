// Last updated: 7/26/2026, 7:49:29 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3       
4        int sum=0;
5        for(int i=0;i<k;i++)
6        {
7           sum+=nums[i];
8        }
9        double avg=(double)sum/k;
10
11        for(int i=k;i<nums.length;i++)
12        {
13            sum+=nums[i]-nums[i-k];
14            if(((double)sum/k)>avg)
15            {
16                avg=(double)sum/k;
17            }
18        }
19        return avg;
20    }
21}