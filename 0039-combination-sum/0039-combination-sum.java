class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>  result= new ArrayList<>();
        combi(candidates,target,0,new ArrayList<Integer>(),result);
        return result;
    }
    public void combi(int[] candidates, int target, int index,ArrayList<Integer> ds, List<List<Integer>>  result){
        if (index==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

            if(candidates[index]<=target){
                ds.add(candidates[index]);
                combi(candidates,target-candidates[index],index,ds,result);
                ds.remove(ds.size()-1);
            }
             combi(candidates,target,index+1,ds,result);
        

    }
}