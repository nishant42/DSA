class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left =0;
        int curr=0;
        Set<Integer> res= new HashSet<>();
        int maxsum=0;
        for(int right=0; right<nums.length;right++){
            while(!res.add(nums[right])){
                res.remove(nums[left]);
                curr-=nums[left];
                left+=1;
            }
            curr+=nums[right];
            maxsum=Math.max(curr,maxsum);


        }
        return maxsum;
    }
}