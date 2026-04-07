class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> difference = new HashMap<>();

        for( int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(difference.containsKey(nums[i])) {
                return new int[] { difference.get(nums[i]), i};
            }
            difference.put(complement, i);
        }

        return new int[] {};
    }
}
