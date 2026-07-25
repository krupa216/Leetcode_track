// Last updated: 7/25/2026, 11:31:01 AM
1class Solution {
2    public int longestMountain(int[] arr) {
3        if( arr.length<3)
4        {
5            return 0;
6        }
7        int max=0;
8       for(int i=1;i<arr.length-1;i++)
9       {
10        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
11        {
12        int r=i;
13        int l=i;
14
15        while(l>0 && arr[l]>arr[l-1])
16        {
17            l--;
18        }
19        while(r<arr.length-1 && arr[r]>arr[r+1])
20        {
21            r++;
22        }
23        max=Math.max(max,r-l+1);
24        }
25     
26
27       }
28       return max;
29    }
30}