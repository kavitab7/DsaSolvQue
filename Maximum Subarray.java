https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int min = Integer.MIN_VALUE; 
        int ans = 0;
        for(int i=0;i<nums.length ;i++){
           ans = ans+ nums[i];
           if(ans>min){
               min= ans;
           }
          if(ans<0){
            ans=0;
        }
        }
        return min;
    }
}

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
