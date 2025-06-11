class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        subset(0,new ArrayList<Integer>(),nums,result);
        return result;
    }
    public void subset(int ind,ArrayList<Integer> ds,int[] nums,
    List<List<Integer>>result){
        result.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            subset(i+1,ds, nums,result);
            ds.remove(ds.size()-1);
        }

    }
}