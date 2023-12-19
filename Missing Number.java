https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int cur = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[cur]){
              int temp = nums[i];
              nums[i] = nums[cur];
              nums[cur] = temp;
            }else{
                i++;
            }
        }
        for(int index= 0; index<nums.length; index++){
            if(nums[index] != index ){
                return index;
            }

        }
       return nums.length;
    }
}
