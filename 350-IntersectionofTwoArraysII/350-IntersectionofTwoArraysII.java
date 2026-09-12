// Last updated: 9/12/2026, 3:09:42 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        List<Integer> l=new ArrayList<>();
4       for(int i=0;i<matrix.length;i++)
5       {
6        for(int j=0;j<matrix.length;j++)
7        {
8          l.add(matrix[i][j]);
9        }
10       }
11       Collections.sort(l);
12       int p=l.get(k-1);
13     
14
15       return p;
16    }
17}