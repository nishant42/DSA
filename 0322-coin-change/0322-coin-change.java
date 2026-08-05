class Solution {
    public int coinChange(int[] coins, int amount) {
       int n = coins.length;
        Integer[][] memo = new Integer[amount+1][n];
        int res= solve(coins,amount,n-1,memo);
        return res==Integer.MAX_VALUE? -1 : res;
        
        }

    int solve(int[] coins, int amount, int i,Integer[][] memo){

        if(amount == 0){
            return 0;
        }
        if(i<0){
            return Integer.MAX_VALUE;
        }
         if (memo[amount][i]!= null){
            return memo[amount][i];
        }
        int skip = solve(coins, amount, i-1,memo);
        int take =Integer.MAX_VALUE;
        if(coins[i]<= amount){
         
         int sub = solve(coins,amount-coins[i],i,memo);
         if (sub!=Integer.MAX_VALUE){
            take=1+sub;
         }}
         memo[amount][i]= Math.min(skip,take);
        return Math.min(skip,take);

    }
}