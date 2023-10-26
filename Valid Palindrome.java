https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        String rev ="";
          s=s.toLowerCase();
        s= s.replace(" ",""); 
        s= s.replaceAll("\\p{Punct}", "");
    for(int i= s.length()-1; i>=0; i--){
        rev = rev+s.charAt(i);
    }
    if(s.equals(rev)){
        return true;
    }else
    return false;
    
    }
}
