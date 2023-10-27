https://leetcode.com/problems/majority-element/description/
class Solution {
    public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //   return nums[n/2];
    HashMap<Integer , Integer> mp = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(mp.containsKey(nums[i])){
            mp.put(nums[i] , mp.get(nums[i])+1);
        }else{
             mp.put(nums[i] , 1);
        }
    }
    for (int key : mp.keySet()) {
            if (mp.get(key) > (nums.length / 2)) {
                return key;
            }
        }
        return -1;
    }
}
