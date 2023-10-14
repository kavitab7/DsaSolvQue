https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i =1;i<nums.length;i++){
            //join 
            if(sum>=0){
                sum +=nums[i];
            }else{
                sum = nums[i];
            }

            //compare
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
