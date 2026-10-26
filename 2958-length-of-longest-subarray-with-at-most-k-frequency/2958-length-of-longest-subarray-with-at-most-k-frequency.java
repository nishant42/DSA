class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int curr=0;
        Map<Integer,Integer> map= new HashMap<>();
        int mymax=0;
        for (int right=0; right<nums.length;right++){
        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1); 
        while(map.get(nums[right])>k ){
        int leftNum = nums[left];
        map.put(leftNum, map.get(leftNum) - 1);
        left += 1;
        }
        
        mymax=Math.max(mymax,right-left+1); 
        }
        return mymax;
    }
}