class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        maxA = 0

        while l < r:
            h = heights[l] if heights[l] < heights[r] else heights[r]
            area = h * (r-l)
            if maxA < area:
                maxA = area

            if heights[l] > heights[r] : r-=1
            else : l += 1

        return maxA