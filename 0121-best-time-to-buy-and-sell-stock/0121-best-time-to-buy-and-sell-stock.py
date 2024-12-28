class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        buymin=prices[0]
        for i in range(1,len(prices)):
            cost=prices[i]-buymin
            profit=max(profit,cost)
            buymin=min(prices[i],buymin)
        return profit 
        