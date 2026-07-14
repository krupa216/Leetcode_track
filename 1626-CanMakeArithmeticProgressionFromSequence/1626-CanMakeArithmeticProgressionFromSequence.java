// Last updated: 7/14/2026, 2:02:15 PM
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==2)
        {
            return true;
        }
       
       for(int i=0;i<arr.length-2;i++)
       {
        
            if((arr[i]-arr[i+1] )!= (arr[i+1]-arr[i+2]))
            {
                return false;
            }
            
        
       }
       return true;

    }
}