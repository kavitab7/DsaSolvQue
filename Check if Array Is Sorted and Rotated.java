https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
   
        for(int i=1;i<nums.length;i++){
            
            if(nums[i-1]>nums[i] ){
                count++;
            }
        }
        
         if(count>1){
                return false;
            }else if(count ==0 || nums[nums.length-1]<=nums[0]){
                return true;
            }else{
                return false;
            }

    }
}
