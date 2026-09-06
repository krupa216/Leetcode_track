// Last updated: 9/6/2026, 4:28:46 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==1)
           {
            c++;
           }
           else 
           {
           max= Math.max(max,c);
           c=0;
           }
        }
        return Math.max(max,c);
    }
}