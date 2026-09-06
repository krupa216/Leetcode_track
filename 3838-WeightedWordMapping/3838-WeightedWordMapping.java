// Last updated: 9/6/2026, 4:23:27 PM
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