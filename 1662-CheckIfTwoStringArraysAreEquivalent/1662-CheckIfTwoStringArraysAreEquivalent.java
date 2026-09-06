// Last updated: 9/6/2026, 4:25:28 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder sb=new StringBuilder();
         StringBuilder sb1=new StringBuilder();
        for(int i=0;i<w1.length;i++)
        {
            sb.append(w1[i]);
        }
        for(int i=0;i<w2.length;i++)
        {
            sb1.append(w2[i]);
        }
        System.out.println(sb1);
        String s1=sb.toString();
        String s2=sb1.toString();
         System.out.println(s1);
          System.out.println(s2);
        if(s2.contains(s1) && s1.contains(s2))
        {
        return true;
        }
        return false;
    }
}