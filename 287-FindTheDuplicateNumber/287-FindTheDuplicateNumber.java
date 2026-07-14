// Last updated: 7/14/2026, 2:03:16 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq =new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            
            freq[nums[i]]++;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]>1)
            {
                return i;
            }
        }
        return -1;
    }
}