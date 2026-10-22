class Solution {
    public int maxProfit(int[] prices) {
        int minval= Integer.MAX_VALUE;
        int maxdiff=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minval){
                minval=prices[i];
            }
            maxdiff= Math.max(maxdiff, prices[i]-minval);
        }
        return maxdiff;
    }
}