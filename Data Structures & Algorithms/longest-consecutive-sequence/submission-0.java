class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new TreeSet<>();
        
        for(int n : nums) {
            numSet.add(n);
        }

        ArrayList<Integer> numArray = new ArrayList<>(numSet);
        int max = 0;

        for (int i = 0; i < numArray.size(); i++) {
            int iter = numArray.get(i);
            int len = 0;
            if( !numSet.contains(iter-1)) {
                while( numSet.contains(iter + len)) {
                    len += 1;
                }
                if(max < len) {
                    max = len;
                }
            }
        }
        return max;
    }
}
