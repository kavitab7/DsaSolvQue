class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
         findPermu(nums, 0, res);
        return res;
    }
    public void findPermu(int[]nums, int fi, List<List<Integer>> res){
        if(fi==nums.length-1){
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ans.add(nums[i]);
            }
            res.add(ans);
            return;
        }
        for(int i = fi; i<nums.length;i++){
            swap(nums , i , fi);
            findPermu(nums , fi+1 , res);
             swap(nums , i , fi);
        }
    }
    public void swap(int[]nums, int i , int fi){
        int temp = nums[i];
        nums[i] = nums[fi];
        nums[fi] = temp;
    }
}