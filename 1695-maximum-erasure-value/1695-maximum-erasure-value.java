class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxsum=0;
        int left=0;
        
        Set<Integer> set = new HashSet<>();
        int curr=0;
        for(int right=0; right< nums.length;right++){
                
                while(set.contains(nums[right])){
                    curr-= nums[left];
                    set.remove(nums[left]);
                    left+=1;
                }
                curr+=nums[right];
                set.add(nums[right]);
                maxsum=Math.max(maxsum,curr);

        }
        return maxsum;
    }
}