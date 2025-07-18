class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
           int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        int low=1,high=maxi;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumvalue(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }

    public boolean sumvalue(int[] nums, int threshold,int div){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=(int)Math.ceil((double)nums[i]/div);

        }
        if(result<=threshold){
            return true;
        }
        return false;

    }
}