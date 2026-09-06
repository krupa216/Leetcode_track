// Last updated: 9/6/2026, 4:25:03 PM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-k;i++)
        {
          int d=nums[i+k-1]-nums[i];
          min=Math.min(min,d);
        }
        return min;
    }
}