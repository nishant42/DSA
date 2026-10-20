class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
 
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[start]){
                // int temp=nums[start];
                nums[start+1]=nums[i];
       
                start++;
            }
            
        }
        return start +1;
    }
}
// nums = [0,0,0,1,1,2,2,3,3,4]

