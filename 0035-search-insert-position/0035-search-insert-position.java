class Solution {
    public int searchInsert(int[] nums, int target) {
          int low=0;
        int high= nums.length-1;
        return binarySearch(nums,target,low,high);
        
    }
    public int binarySearch(int[] nums, int target,int low,int high){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

}
