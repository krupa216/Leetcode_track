// Last updated: 7/14/2026, 2:02:28 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return substring
        return str1.substring(0, gcdLength);
    }

    // Euclidean Algorithm for GCD
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
}