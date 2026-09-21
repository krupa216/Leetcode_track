// Last updated: 9/21/2026, 3:23:58 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> l=new ArrayList<>();
       for(int i=0;i<matrix.length;i++)
       {
        for(int j=0;j<matrix.length;j++)
        {
          l.add(matrix[i][j]);
        }
       }
       Collections.sort(l);
       int p=l.get(k-1);
     

       return p;
    }
}