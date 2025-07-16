class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
      int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low=mini,high=maxi;
        int ans=0;
        while(low<=high){
                int mid=low+(high-low)/2;
                if(validFlower(bloomDay,m,k,mid)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

        }

        return ans;
    }
    public boolean validFlower(int[] bloomDay, int m, int k,int d){
        int count=0;
        int bDay=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=d){
            count+=1;
            }
            else{
                bDay+=count/k;
                count=0;
            }
        }
        bDay+= count/k;
        if(bDay>=m){
            return true;
        }
        return false;


    }
}