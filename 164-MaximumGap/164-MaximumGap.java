// Last updated: 9/7/2026, 2:11:00 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        Arrays.sort(nums);
4        int j=1;
5        int max=0;
6        for(int i=0;i<nums.length-1;i++)
7        {
8          if(nums[j]-nums[i]>max)
9          {
10            max=nums[j]-nums[i];
11          }
12          j++;
13        }
14        return max;
15    }
16}