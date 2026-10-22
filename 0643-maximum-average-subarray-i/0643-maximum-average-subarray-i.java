class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
         double sum1=0;
         int left=0;
         double avg;
         for (int i=0; i<k;i++){
            sum1 +=nums[i];
         }
         avg=  sum1/k ;
         double maxavg=avg;
         for(int j= k ; j<nums.length ; j++){
            sum1 += nums[j];
            sum1-= nums[left];
            avg=  sum1/k;
            maxavg= Math.max(avg,maxavg);
            left+=1;
         }
         return maxavg;
    }
}