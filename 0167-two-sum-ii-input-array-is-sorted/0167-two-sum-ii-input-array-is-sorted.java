class Solution {
    public int[] twoSum(int[] numbers, int target) {
     Map<Integer,Integer> result = new HashMap<>();
     for(int i=0;i<numbers.length;i++){
        int t= target- numbers[i];
        if(!result.containsKey(t)){
            result.put(numbers[i],i);
        }
        else{
            return new int[]{result.get(t)+1,i+1};
        }
     }   
     return new int[]{};
    }
}