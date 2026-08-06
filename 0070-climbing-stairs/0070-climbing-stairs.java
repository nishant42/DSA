class Solution {
    public int climbStairs(int n) {
        Integer[] memo= new Integer[n];
        return solve(n,0,memo);
    }

    int solve(int n,int i,Integer[] memo){
        if (i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if (memo[i]!= null){
            return memo[i];
        }
        int lo= solve(n,i+2,memo);
        int skip= solve(n,i+1,memo);
        memo[i]= lo + skip;
        return memo[i];

    }
}