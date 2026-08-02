class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int j = 0; j < nums.length; j++) {   // saara sum jodo
            total += nums[j];
        }
        if (total % 2 != 0) return false;          // odd -> impossible

        int target = total / 2; 
        int n= nums.length;    
        Boolean[][] memo = new Boolean[n+1][target +1];               // har dher ka sum
        return solve(nums, target, nums.length,memo);   // subset dhundo jiska sum = target
    }

    boolean solve(int[] nums, int target, int i,Boolean[][] memo) {
        if (target==0){
             return true;
        }
        if (i==0){
            return false;
        }
        if(memo[i][target]!= null){
            return memo[i][target];
        }
         boolean ans;
        if (target<nums[i-1]){
            return solve(nums,target,i-1,memo);
        }
       
        else{
           ans= solve(nums,target-nums[i-1],i-1,memo) || solve(nums,target,i-1,memo);
           }
           memo[i][target]=ans;
           return ans;
    }
        
}
