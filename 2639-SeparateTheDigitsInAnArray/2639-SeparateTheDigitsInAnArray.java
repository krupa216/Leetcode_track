// Last updated: 7/14/2026, 2:01:49 PM
class Solution {
    public int[] separateDigits(int[] nums) {
       List<Integer> lt=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
             List<Integer> l=new ArrayList<>();
            while(nums[i]>0)
            {
                int t=nums[i]%10;
                l.add(t);
                nums[i]/=10;
                  
            }
             Collections.reverse(l);
             lt.addAll(l);
         
        }
        int[] a=new int[lt.size()];
        for(int i=0;i<lt.size();i++)
        {
            a[i]=lt.get(i);
        }
        return a;
    }
}