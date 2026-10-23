class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set1= new HashSet<>();
        char[] cha= s.toCharArray();
        int left=0;
        int right=0;
        int maxval= 0;
        for(char i:cha){
        
           while(!set1.add(i)){
            set1.remove(cha[left]);
            left+=1;
           }
           
           right+=1;
           maxval=Math.max(maxval,right-left);

        }
        return maxval;
    }
}