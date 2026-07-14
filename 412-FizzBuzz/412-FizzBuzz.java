// Last updated: 7/14/2026, 2:02:58 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l1=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String s="";
          if(i%3==0 && i%5==0)
          {
            s=s+"FizzBuzz";
          }
          else if(i%3==0)
          {
            s=s+"Fizz";
          }
          else if(i%5==0)
          {
            s=s+"Buzz";
          }
          else
          {
            String res=String.valueOf(i);
            s=s+i;
          }
         l1.add(s);
        }
        return l1;
    }
}