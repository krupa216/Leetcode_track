// Last updated: 7/14/2026, 2:03:46 PM
class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            int m=i+(j-i)/2;
            if(nums[m]>nums[j])
            {
                i=m+1;
            }
            else if(nums[m]<nums[i])
            {
                j=m;
                i++;
            }
            else
            {
                j--;
            }
        }
        return nums[i];
    }
}