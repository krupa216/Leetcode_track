// Last updated: 7/14/2026, 2:02:23 PM
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] res=new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for (int i = heights.length- 1; i >= 0; i--)
         {
            int count = 0;
            while (!st.isEmpty() && st.peek() < heights[i]) 
            {
                st.pop();
                count++;
            }

            if (!st.isEmpty()) count++;

            res[i] = count;
            st.push(heights[i]);
        }

        return res;
    }
}