// Last updated: 8/31/2026, 12:14:26 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum=0;int min=Integer.MAX_VALUE;
4        int j=0;
5        for(int i=0;i<nums.length;i++)
6        {
7                sum+=nums[i];
8               
9                while(sum>=target)
10                {
11                        min=Math.min(min,i-j+1);
12                    sum-=nums[j];
13                    j++;
14                }
15
16                 System.out.println(sum);
17            
18             
19        }
20      
21        return min==Integer.MAX_VALUE ?0 :min;
22    }
23}