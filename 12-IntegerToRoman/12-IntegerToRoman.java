// Last updated: 7/14/2026, 2:04:37 PM
class Solution {
    public String intToRoman(int num) {
        int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String st="";
        for(int i=0;i<arr.length;i++)
        {
            while(num>=arr[i])
            {
                num=num-arr[i];
                st=st+s[i];

            }
        }
        return st;
    }
}