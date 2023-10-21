https://leetcode.com/problems/valid-anagram/
class Solution {
    HashMap<Character , Integer>makeFreqMap(String s){
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                int freq = mp.get(ch);
                mp.put(ch , freq+1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
          HashMap<Character , Integer> mp = makeFreqMap(s);
          for(int i=0;i<t.length();i++){
               Character ch = t.charAt(i);
                if(!mp.containsKey(ch)){
              return false;
            }else{
                int freq = mp.get(ch);
                mp.put(ch , freq-1);
            }
          }

          for(Integer i : mp.values()){
              if(i!=0) return false;
          }
        return true;
    }
}
