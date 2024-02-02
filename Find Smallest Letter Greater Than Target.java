https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end= letters.length;
        
        while(start<end){   
            int mid = (start+end)/2;      
            if(letters[mid]>target){
               end = mid;
            }else {
                 start = mid+1;
               
            }
        }
        return letters[start % letters.length];
    }
}
