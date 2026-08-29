// Last updated: 8/29/2026, 8:45:20 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        int max=0;
        int min=nums[0];
        for(int j:nums)
        {
            max=Math.max(max,j);
            min=Math.min(min,j);
            h.add(j);
        }
        for(int i=min+1;i<max;i++)
        {
           if(!h.contains(i))
           {
                a.add(i);
           }
        }
        return a;
    }
}