class Solution {
    public int removeDuplicates(int[] nums) {
        int r = 1; 
        int l = 1;
        while(r<nums.length){
            if(nums[r]==nums[r-1]){
                r++;
                continue;
            } else {
                nums[l] = nums[r];
                r++;
                l++;
            }
        }

        return l;
    }
}