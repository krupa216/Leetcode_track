// Last updated: 9/6/2026, 4:27:30 PM
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> h=new HashSet<>();
        for(String w:words)
        {
            String odd="";
            String even="";
            for(int i=0;i<w.length();i++)
            {
                if(i%2==0)
                {
                    even+=w.charAt(i);
                }
                else
                {
                    odd+=w.charAt(i);
                }
            }
            char[] c1=odd.toCharArray();
              char[] c2=even.toCharArray();
              Arrays.sort(c1);
              Arrays.sort(c2);
              h.add(new String(c1)+new String(c2));
        }
    return h.size();
    }
}