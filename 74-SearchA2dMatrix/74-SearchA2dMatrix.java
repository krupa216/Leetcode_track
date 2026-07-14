// Last updated: 7/14/2026, 2:04:07 PM
class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(m[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}