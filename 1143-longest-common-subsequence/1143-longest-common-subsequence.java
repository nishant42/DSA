class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] memo= new Integer[text1.length()+1][text2.length()+1];
        return solve(text1,text2,0,0,memo);
        
    }
    int solve(String text1, String text2,int i , int j,Integer[][] memo){

        int n1= text1.length();
        int n2 = text2.length();
        if(i==n1 || j== n2){
            return 0;
        }
        if(memo[i][j]!= null){
            return memo[i][j];
        }
        int x;
        if(text1.charAt(i)==text2.charAt(j)){
             x= 1 + solve(text1,text2,i+1,j+1,memo);
        }
        else{
             x= Math.max(solve(text1,text2,i+1,j,memo),solve(text1,text2,i,j+1,memo));
        }
        return memo[i][j]= x;


    }
}