https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
       
         int[] ans = { -1 ,-1};
       ans[0] = search(nums , target , true);
     ans[1] = search(nums , target , false);
      return ans;
    }
    public int search(int[] nums, int target, boolean startIndex) {
        int ans = -1;
        int s= 0;
        int e= nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]<target){
                s= mid+1;
            }else if(nums[mid]>target) {
                e = mid-1;
            }else{
                ans = mid;
                if(startIndex){
                  e = mid-1; 
            }else{
                s = mid+1;
                }
            }

        }
        return ans;
    }
}
