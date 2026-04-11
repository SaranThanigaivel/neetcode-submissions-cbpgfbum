class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        tP = 1 
        zCount = 0
        for n in nums:
            if n:
                tP *= n
            else :
                zCount += 1


        res = [0] * len(nums)
        if zCount > 1 : return res

        for i, c in enumerate(nums):
            if zCount: res[i] = 0 if c else tP
            else : res[i] = tP // c

        return res
        

        