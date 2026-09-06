// Last updated: 9/6/2026, 4:25:12 PM
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> h=new HashMap<>();
        for(int[] a:logs)
        {
            int u=a[0];
            int v=a[1];
            if(!h.containsKey(u)){
                h.put(u,new HashSet<>());
                h.get(u).add(v);
            }
            else
            {
                h.get(u).add(v);
            }
        }
        int[] ans=new int[k];
        for(int a:h.keySet())
        {
            HashSet<Integer> b=h.get(a);
            ans[b.size()-1]++;
        }
        return ans;
    }
}