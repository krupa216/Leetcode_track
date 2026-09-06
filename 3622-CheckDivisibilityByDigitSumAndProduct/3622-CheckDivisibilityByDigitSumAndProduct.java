// Last updated: 9/6/2026, 4:23:49 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int n1=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n=n/10;
        }
        int res=sum+pro;
        System.out.println(res);
        if(n1%res!=0)
        {
            return false;
        }
 
       return true;  
    }
     
}