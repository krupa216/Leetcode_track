// Last updated: 7/14/2026, 2:03:35 PM
class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean[] freq=new boolean[n];
        for(int i=2;i<n;i++)
        {
        if(freq[i]==false)
        {
            c++;
        }
        for(int j=2;i*j<n;j++)
        {
            freq[i*j] =true;
        }
         
        } 
        
        return c;
    }
}