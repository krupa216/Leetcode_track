// Last updated: 9/6/2026, 4:27:48 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int j=0;j<jewels.length();j++)
        {
        for(int i=0;i<stones.length();i++)
        {
        if(stones.charAt(i)==jewels.charAt(j))
        {
            c++;
        }
        }
        }
        return c;
    }
}