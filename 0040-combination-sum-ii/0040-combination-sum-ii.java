class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        combinationsum2(0,target,candidates,new ArrayList<>(),result);
        return result;
    }
    public void combinationsum2(int index,int target,int[] candidates
    ,List<Integer> ds,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            ds.add(candidates[i]);
             combinationsum2(i+1,target-candidates[i],candidates,ds,result);
             ds.remove(ds.size()-1);

        }
    }
}