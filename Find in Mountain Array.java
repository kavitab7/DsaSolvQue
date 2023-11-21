https://leetcode.com/problems/find-in-mountain-array/
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak =  peakIndexInMountainArray(mountainArr);
        int ans = binarySearch(mountainArr , target , 0 , peak , true);
        if(ans != -1){
            return ans;
        }
        return  binarySearch(mountainArr , target ,  peak ,mountainArr.length()-1, false);
        
    }
    int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length()-1;
          
         while(start < end) {

            int mid = start + (end - start) / 2;

            if(arr.get(mid) > arr.get(mid + 1)) {

                end = mid;
            }
            else {

                start = mid + 1;
            }

        }
        return start;
    }
    int binarySearch (MountainArray arr, int target, int start, int end, boolean isAsc) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr.get(mid) == target) {
                return mid;
            }

            if(isAsc) {
                if(arr.get(mid) > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {

                if(arr.get(mid) < target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
