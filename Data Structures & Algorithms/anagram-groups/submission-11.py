class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        a = ord("a")
        for s in strs:
            count = [0] * (a + 26)
            for c in s:
                count[ord(c)] += 1
            
            res[tuple(count[a:])].append(s)
        
        return list(res.values())