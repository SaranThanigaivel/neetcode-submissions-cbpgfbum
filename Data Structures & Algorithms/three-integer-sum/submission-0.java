class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sort it
        List<List<Integer>> res = new ArrayList<>();

        for( int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break; // need atleast one negative number to get the result to 0.
            if(i > 0 && nums[i] == nums[i-1]) continue; // We don't want to check for duplicate values.
            
            int l = i + 1, r = nums.length - 1; // Simply use the two sum concept for the rest of the aray.
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) {
                    r --;
                } else if ( sum < 0 ) {
                    l ++ ;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while ( l < r && nums[l] == nums[l - 1 ]) { // same thing as "i" iterator, we don't want to loop duplicats left.
                        l++;
                    }
                }
            }
        }
        
        return res;
    }
}
