class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int[] sortedCopy = Arrays.copyOf(piles, piles.length);
        // Sort the copied array
        Arrays.sort(sortedCopy);
        int high=sortedCopy[sortedCopy.length-1];
        int low=1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalhour=totalHour(piles, mid);
            if(totalhour<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int totalHour(int[] arr, int k) {
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+= Math.ceil((double)(arr[i])/k);
        }
        return total;
    }
}