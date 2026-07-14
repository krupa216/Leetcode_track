// Last updated: 7/14/2026, 2:01:55 PM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> n=new ArrayList<>();
        int[] c=new int[1001];

        for(int[] arr:nums)
        {
            for(int i:arr)
            {
                c[i]++;
            }
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==nums.length)
            {
                n.add(i);
            }
        }
        return n;
    }
}