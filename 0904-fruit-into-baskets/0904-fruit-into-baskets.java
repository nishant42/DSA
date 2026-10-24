class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxval=0;
        int curr=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            curr+=1;
            map.merge(fruits[right], 1, Integer::sum);
            while(map.size()>2){
            // Decrease its tally
            int leftFruit= fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                
                // If we have 0 of this fruit left, completely erase it from the tally sheet
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left+=1;
                curr -= 1;
            }
            maxval= Math.max(maxval,curr);
        }
        return maxval;
    }
}