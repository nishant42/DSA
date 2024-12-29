class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ''' any profit is made by selling the stock at the price at that day 
        and buying at minimum price before that day , if we had chosen first
        then sell and buy would be same which results into 0 , thus we started from 
        second element in the array.
        min buy price updates by chosing min between the previous min price and current
        index after finding the cost.
        return profit if no buy or sell happended then buy default 0 is returned.
        For brute force [0][0] becomes [0][3] and [0][1] become [1][3] -> conclude
        left side j become right side i and right side j= (n-1)-i for n=4 i=0 ->3   
        '''
        profit=0
        buymin=prices[0]
        for i in range(1,len(prices)):
            cost=prices[i]-buymin
            profit=max(profit,cost)
            buymin=min(prices[i],buymin)
        return profit 
        