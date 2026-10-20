class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        for (int i=0 ; i< nums.length ;i++){
            if(nums[i]==0){
                continue;
            }
            else{
                int x=nums[slow];
                nums[slow]= nums[i];
                nums[i]=x;
                slow+=1;
            }

        }
        
    }
}