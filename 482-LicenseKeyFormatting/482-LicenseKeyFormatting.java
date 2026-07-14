// Last updated: 7/14/2026, 2:02:52 PM
class Solution {
    public String licenseKeyFormatting(String s, int k) 
    {
       String x= s.replace("-","").toUpperCase();
        StringBuilder sb=new StringBuilder(x);
        for(int i=sb.length()-k;i>0;i-=k)
        {
            sb.insert(i,"-");
        }
        return sb.toString();
    }
}
