// Last updated: 8/1/2026, 7:25:19 PM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char[] e1={s1.charAt(0),s1.charAt(2)};
4        char[] e2={s2.charAt(0),s2.charAt(2)};
5        char[] o1={s1.charAt(1),s1.charAt(3)};
6        char[] o2={s2.charAt(1),s2.charAt(3)};
7
8        Arrays.sort(e1);
9          Arrays.sort(e2);
10            Arrays.sort(o1);
11              Arrays.sort(o2);
12              return Arrays.equals(e1,e2) && Arrays.equals(o1,o2);
13    }
14}