// Last updated: 7/14/2026, 2:01:42 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fre=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            fre[nums[i]]++;
        }
        int max=0;
        int c=0;
        for(int i=0;i<fre.length;i++)
        {
            
            if(fre[i]>max)
            {
               
                max=fre[i];
              
            }
            
        }
        
         for(int i=0;i<fre.length;i++)
         {
            if(max==fre[i])
            {
                c+=max;
            }
         }
        return c;
    }
}