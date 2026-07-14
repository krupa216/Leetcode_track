// Last updated: 7/14/2026, 2:04:20 PM
import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n=new BigInteger(num1);
         BigInteger m=new BigInteger(num2);
         BigInteger res=n.multiply(m);
         return res.toString();

    }
}