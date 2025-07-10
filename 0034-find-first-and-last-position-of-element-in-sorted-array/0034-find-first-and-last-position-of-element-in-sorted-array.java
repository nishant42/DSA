class Solution {
    public int[] searchRange(int[] nums, int target) {
    int low=0;
        int high= nums.length-1;
        int first=startBinary(nums,target,low,high);
        int last=endBinary(nums,target,low,high);
        return new int[] {first,last};
        
    }
    public int startBinary(int[] nums, int target,int low,int high){
        int ans=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            ans=mid;
            high=mid-1;
        }
        else if(nums[mid]<target){
              low=mid+1;  
        }
        else{
            high=mid-1;
        }
    }
    return ans;
    }
      public int endBinary(int[] nums, int target,int low,int high){
         int ans=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            ans=mid;
             low=mid+1;
        }
        else if(nums[mid]<target){
              low=mid+1;  
        }
        else{
            high=mid-1;
        }
    }
    return ans;
        
    }
}