class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans= new ArrayList<>();
      mypermute(0,nums,ans);
      return ans;

    }
    public void mypermute(int index,int[] nums,List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(index,i,nums);
            mypermute(index+1,nums,ans);
            swap(i,index,nums);
        }

    }
    public void swap(int i,int j, int[] nums){
        int x= nums[i];
        nums[i]=nums[j];
        nums[j]=x;

    }
}