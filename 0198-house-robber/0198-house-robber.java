class Solution {
    public int rob(int[] nums) {
      
       Integer[] memo= new Integer[nums.length];
        return solve(nums,0,memo);
        
    }

    int solve(int[] nums , int i,Integer[] memo){
       int n = nums.length;
        if(i>=n){
            return 0;
        }
        if (memo[i] != null){
            return memo[i];
        }
        int rob= nums[i] + solve(nums,i+2,memo);
        int skip= solve(nums,i+1,memo);
        memo[i]= Math.max(rob,skip);
        return memo[i];

    }
}