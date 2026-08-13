class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return solve( s,0,dict,memo);
        
    }
    boolean solve(String s,int start, Set<String> dict,Boolean[] memo){

        if (start== s.length()){
            return true;
        }
        for (int end = start +1 ; end <= s.length() ; end++){

            String word = s.substring(start,end);
            if (memo[start] != null){
                return memo[start];
            }
            if(dict.contains(word) && solve(s,end,dict,memo)){
                return memo[start]= true;
            }
            
           
        }

     return memo[start]= false;

    }
}