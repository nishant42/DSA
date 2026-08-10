class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        Integer[][] memo= new Integer[n][n];
        return solve(s,0,n-1,memo);
        
    }

    int solve(String s , int i , int j , Integer[][] memo){

        if (i==j){
            return 1;
        }
    
        if(i>j){
            return 0;
        }
        if (memo[i][j] != null){
            return memo[i][j];
        }
        int ans;
        if(s.charAt(i) == s.charAt(j))
        {
            ans= 2 + solve(s, i+1 ,j -1,memo);
        }
        else {
            ans= Math.max(solve(s , i+1 ,j,memo), solve(s, i , j-1,memo));
        }
       return  memo[i][j] = ans;
         


    }
}