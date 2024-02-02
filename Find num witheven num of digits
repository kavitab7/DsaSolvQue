https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class Solution {
    public boolean even(int n){
        int digits=0;
        while(n!=0){
            n=n/10;
            digits++;
        }
        if(digits%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        int digit =0;
        for(int i =0;i<nums.length;i++){
            int n = nums[i];
            if(even(n)){
                count++;
            }
        }
        return count;
    }
}
