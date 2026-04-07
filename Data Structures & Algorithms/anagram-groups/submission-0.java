class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> result = new HashMap<>();

        for( String str : strs ) {
            int[] charCount = new int[26];
            
            for(char c: str.toCharArray()) {
                charCount[c-'a']++;
            }

            StringBuilder charKey = new StringBuilder();
            for(int i = 0; i < 26;i++){
                charKey.append('#');
                charKey.append(charCount[i]);
            }

            result.computeIfAbsent(charKey.toString(), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(result.values());
    }
}
