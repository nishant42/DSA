class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0);
        
        
    }

    int solve(int[] nums, int target,int i){
        int n = nums.length;
        if (i==n){
            if(target==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        int plus, minus;
        plus= solve(nums, target-nums[i],i+1);
        minus=solve(nums,target+nums[i],i+1);

        return plus + minus;

    }
}