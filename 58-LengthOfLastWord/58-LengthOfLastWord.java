// Last updated: 7/14/2026, 2:04:16 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
       String s2="";
        for(int i=0;i<arr.length;i++)
        {
          s2+=arr[arr.length-1];
          return s2.length();
          
        }
        return s2.length();
    }
}