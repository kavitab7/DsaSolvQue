https://www.youtube.com/watch?v=MxgBfF5ti8o&list=PLxgZQoSe9cg00xyG5gzb5BMkOClkch7Gr&index=65
https://leetcode.com/problems/two-sum/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans ={-1};
        HashMap<Integer , Integer> mp= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int partner = target - nums[i];
        if(mp.containsKey(partner)){
            ans = new int[]{i , mp.get(partner)};
            return ans;
        }
        mp.put(nums[i] , i);
    }
    return ans;
    }
}

//brute
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;       
        for(int i =0; i<n-1;i++){
            for( int j =i+1 ; j<n; j++){
                if(nums[i] + nums [j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
