class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minlen= Integer.MAX_VALUE;
        int curr=0;
        
        for(int right=0;  right< nums.length ; right++){
            curr+=nums[right];
            while(curr>=target){
                minlen= Math.min(minlen,right-left+1);
                curr-=nums[left];
                left+=1;
            }

        }
        if(minlen>nums.length) {
            return 0;
        }
        return minlen;
    }
}