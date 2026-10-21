class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] num=nums;
        int n= nums.length;
          Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<n;i++){
          Set<Integer> set2 = new HashSet<>();
          for(int j=i+1; j<n;j++){
              int third= -(num[i]+num[j]);
              if(set2.contains(third)){
                List<Integer> temp=Arrays.asList(num[i],num[j],third);
                Collections.sort(temp);
                st.add(temp);
              }
              set2.add(num[j]);
          }

        }

      
         return new ArrayList<>(st);
    }
}