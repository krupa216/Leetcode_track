// Last updated: 7/14/2026, 2:03:44 PM
class Solution {
    public String convertToTitle(int n) {
        String st="";
        while(n>0)
        {
            n-=1;
           int t=n%26;
           st=(char)(65+t)+st;
           n/=26;
           

        }
        return st;
    }
}