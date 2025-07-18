class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        int ans=0;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(minday(weights,days,mid)){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
        return ans;
    }
    public boolean minday(int[] weights, int days,int mCap){
        int load=0;
        int dday=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mCap){
                  dday+=1;
                  load=weights[i];
            }
            else{
               load+=weights[i];
            }

        }
        if(dday<=days){
            return true;
        }
        return false;
    }
}