https://leetcode.com/problems/longest-consecutive-sequence/description/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        
        for(int num : nums){
            st.add(num);
        }  
          int maxS = 0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while(st.contains(currNum+1)){
                currStreak++;
                currNum++;
            }
               maxS = Math.max(maxS , currStreak);
            }
           
        }
        return maxS;
    }
}
