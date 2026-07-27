// Last updated: 7/27/2026, 2:26:58 PM
class Solution {
    public int longestMountain(int[] arr) {
        if( arr.length<3)
        {
            return 0;
        }
        int max=0;
       for(int i=1;i<arr.length-1;i++)
       {
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
        {
        int r=i;
        int l=i;

        while(l>0 && arr[l]>arr[l-1])
        {
            l--;
        }
        while(r<arr.length-1 && arr[r]>arr[r+1])
        {
            r++;
        }
        max=Math.max(max,r-l+1);
        }
     

       }
       return max;
    }
}