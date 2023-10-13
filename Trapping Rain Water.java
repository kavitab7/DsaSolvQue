https://leetcode.com/problems/trapping-rain-water/description/

class Solution {
    public int trap(int[] height) {
        int[] lb = new int[height.length];
        int[] rb = new int[height.length];
int res=0;
        lb[0] = height[0];
        for(int i=1;i<height.length;i++){
            lb[i] = Math.max(lb[i-1] , height[i]);
        }

         rb[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0; i--){
            rb[i] = Math.max(rb[i+1] , height[i]);
        }

        for(int i=1;i<height.length;i++){
        res = res + (Math.min(rb[i] , lb[i])-height[i]);
        }
    return res;
    }
}
