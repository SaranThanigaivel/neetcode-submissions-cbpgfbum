class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();

        for(int n : nums) {
            if(!temp.contains(n)) {
                temp.add(n);
            } else {
                return true;
            }
        }
        return false;
    }
}