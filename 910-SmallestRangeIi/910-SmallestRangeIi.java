// Last updated: 9/6/2026, 4:27:26 PM
class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int r=nums[nums.length-1]-nums[0];
        int min=nums[0]+k;
        int max=nums[nums.length-1]-k;
        for(int i=0;i<nums.length-1;i++)
        {
           
            int max1=Math.max(max,nums[i]+k);
           int min2=Math.min(min,nums[i+1]-k);
           r=Math.min(r,max1-min2);
        }
        return r;
    }
}