// Last updated: 7/14/2026, 2:02:50 PM
class Solution {
    public boolean checkPerfectNumber(int num) 
    {
        int i,sum=0,num2=num;
        for(i=1;i<num;i++)
        {
        int res=num%i;
        if(res==0)
        {
         sum+=i;
        }
        }
        if(num2==sum)
        
          return true;
        
        return false;
    }
   
}
        
    
