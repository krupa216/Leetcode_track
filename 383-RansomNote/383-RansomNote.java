// Last updated: 7/14/2026, 2:03:02 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] noteArr = ransomNote.toCharArray();
        char[] magArr = magazine.toCharArray();

        Arrays.sort(noteArr);
        Arrays.sort(magArr);

        int i = 0, j = 0;

        while (i < noteArr.length && j < magArr.length) {
            if (noteArr[i] == magArr[j]) {
                i++;
            }
            j++; 
        }
        if( i == noteArr.length)
            return true;
        else
        return false;
        
    }
 
}