class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        checkSet = set(nums)
        res = 0;

        for n in nums:
            if (n-1 not in checkSet):
                seq = 0

                while ( n in checkSet) :
                    seq += 1
                    n += 1 
                
                if( seq > res ): res = seq
        
        return res