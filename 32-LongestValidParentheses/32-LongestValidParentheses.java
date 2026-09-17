// Last updated: 9/17/2026, 11:02:53 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4        int max=0;
5        st.push(-1);
6        for(int i=0;i<s.length();i++)
7        {
8            if(s.charAt(i)=='(')
9            {
10                st.push(i);
11
12            }
13            else
14            {
15                st.pop();
16                if(st.isEmpty())
17                {
18                    st.push(i);
19                }
20                else
21                {
22                    max=Math.max(max,i-st.peek());
23                }
24            }
25        }
26        return max;
27    }
28}