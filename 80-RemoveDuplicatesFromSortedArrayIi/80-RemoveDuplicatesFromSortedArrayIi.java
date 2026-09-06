// Last updated: 9/6/2026, 4:30:48 PM
class Solution {
    public int removeDuplicates(int[] nums) {
     int i=0;
     for(int n:nums)
     {
        if(i<2 || n>nums[i-2])
        {
            nums[i++]=n;
        }
       }
       return i;
    }
}