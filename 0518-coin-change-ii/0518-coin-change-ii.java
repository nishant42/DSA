class Solution {
    public int change(int amount, int[] coins) {
        int n= coins.length;
        Integer[][] res= new Integer[amount+1][n];
        return solve(amount,coins,n-1,res);

        
    }


    int solve(int amount,int[] coins,int  i,Integer[][] res){
         if (amount==0){
            return 1;
        }
        if (i<0){
            return 0;
        }
       
        int x=0;
         if (res[amount][i] != null){
            return res[amount][i];
         }
        if(coins[i]<= amount){
            x=solve(amount-coins[i],coins,i,res);
        }
        
        int y=solve(amount,coins,i-1,res);
        res[amount][i]= x+y;
        return x+y;



    }
}

/*
- [ ] 1. STATE — har step pe kya-kya badal raha hai?e.g. knapsack → i (items baaki) aur W (jagah baaki) · ye function ke parameters ban jaate hain2
- [ ] . RETURN — function ek line me kya jawab deta hai?e.g. solve(i, W) = pehle i items se, W jagah me, max value
- [ ] 3. CHOICE — is cheez pe kaunse options hain?e.g. lo (value jodo, jagah ghatao) ya chhodo
- [ ] 4. BASE CASE — kab ruko, aur tab kya return?e.g. i == 0 ya W == 0 → 0
- [ ] 5. COMBINE — do raaste kaise jodo?e.g. max(lo, chhodo) · [ya min / sum / OR — problem ke hisaab se]

*/