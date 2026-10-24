class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
   
        int minval=Integer.MAX_VALUE;
        int curr=0;
        for (int right=0;right<nums.length;right++){
            curr+=nums[right];
           
            while(curr>=target){
            minval=Math.min(minval,right-left+1);
                curr-=nums[left];
                left+=1;
                }

          
        }
       return minval == Integer.MAX_VALUE ? 0 : minval;

    }
}