// Last updated: 9/21/2026, 3:22:04 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int max=0;
        int j=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            while(h.contains(nums[i]))
            {
                  h.remove(nums[j]);
                  sum-=nums[j];
                  j++;
            }
            h.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
        }
       
        return max;
    }
}