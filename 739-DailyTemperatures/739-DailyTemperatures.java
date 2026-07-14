// Last updated: 7/14/2026, 2:02:46 PM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int arr[]=new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            if(t[st.peek()]<t[i])
            {
                while(!st.isEmpty()&& t[st.peek()]<t[i])
                {
                    arr[st.peek()]=i-st.peek();
                    st.pop();
                }
                st.push(i);
            
            
            }
            else
            {
                st.push(i);
            }
        }
        return arr;
    }
}