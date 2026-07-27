// Last updated: 7/27/2026, 11:36:56 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3      int c=0;
4        for(int i=0;i<nums.length-1;i++)
5        {
6            if(nums[i]>nums[i+1])
7            {
8              c++;
9            
10              if(c>1)
11        {
12            return false;
13        }
14                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
15                    nums[i] = nums[i + 1];
16                } else {
17                    nums[i + 1] = nums[i];
18                }
19            }
20        }
21      
22        return true;
23      
24    }
25}