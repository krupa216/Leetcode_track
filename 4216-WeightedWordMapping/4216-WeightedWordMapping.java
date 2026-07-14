// Last updated: 7/14/2026, 2:01:24 PM
class Solution {
    public String mapWordWeights(String[] w, int[] weights) {
        String st="";
        for(int i=0;i<w.length;i++)
        {
            int s=0;
            for(char ch : w[i].toCharArray()){
                s+=weights[ch-'a'];
            }
            int v=s%26;
            st=st+(char)('z'-v);

        }
        return st;
    }
}