class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        checkSet = set(nums)
        res = 0;

        for n in nums:
            if (n-1 not in checkSet):
                tmp = n
                seq = 0

                while ( tmp in checkSet) :
                    seq += 1
                    tmp += 1 
                
                if( seq > res ): res = seq
        
        return res