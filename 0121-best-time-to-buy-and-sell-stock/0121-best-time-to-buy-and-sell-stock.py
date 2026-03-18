class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left=0
        right=len(prices)-1
        mymin=prices[left]
        profit=0
        if not prices:
            return 0
        
        for i in prices:
            mymin=min(mymin,i)
            profit = max(profit,i-mymin)
        return profit