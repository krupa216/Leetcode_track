// Last updated: 9/21/2026, 3:24:25 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        } 
        List<Integer> l=new LinkedList<>();
        int[] f=new int[2];
        for(Map.Entry<Integer,Integer> j:h.entrySet())
        {
            if(j.getValue()==1)
            {
                l.add(j.getKey());
            }
        }
        int p=0;
        for(int i:l)
        {
            f[p]=i;
            p++;
        }
        return f;
    }
}