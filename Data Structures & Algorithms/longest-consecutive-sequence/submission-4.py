class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        checkSet = set(nums)
        res = 0;

        for n in nums:
            seq = 0
            while ( n in checkSet) :
                seq += 1
                n += 1 
            
            res = max(res, seq)
        
        return res