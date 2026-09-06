// Last updated: 9/6/2026, 4:24:46 PM
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if(suits[0]==suits[1] &&suits[0]== suits[2]&& suits[0]==suits[3]&&suits[0]== suits[4])
        {
            return "Flush";
        }
        int[] arr= new int[14];
        for(int i=0;i<ranks.length;i++)
        {
            arr[ranks[i]]++;
        }
        boolean s=false;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>=3)
        {
            return "Three of a Kind";
        }
        else if(arr[i]==2)
        {
            s=true;
        }
        }
        if(s)
        {
            return "Pair";
        }
        return "High Card";
    }
}