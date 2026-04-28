class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1 # buy and sell
        maxP = 0 
        # we can't sell in future so r needs to be above the left or buy

        while r < len(prices):
            if prices[r] > prices[l]:
                profit = prices[r] - prices[l]
                if maxP < profit:
                    maxP = profit
            else :
                l = r
            r += 1
        
        return maxP
                
