class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length() ) {
            return false;
        }

        HashMap<Character, Long> sCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            sCount.put(c, sCount.getOrDefault(c, 0L) + 1L);
        }

        HashMap<Character, Long> tCount = new HashMap<>();

        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0L) + 1L);
        }

        if(sCount.keySet().size() != tCount.keySet().size() ) return false;

        for(char c : sCount.keySet()) {
            if(tCount.get(c) == null) return false;

            if (!tCount.get(c).equals(sCount.get(c))) return false;
        }

        return true;
    
    }
}
