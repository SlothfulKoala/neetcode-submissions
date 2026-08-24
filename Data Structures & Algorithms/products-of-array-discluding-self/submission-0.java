class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[] = new int[nums.length];
        int suf[] = new int[nums.length];
        int prod = 1;

        for(int i = 0; i<nums.length; i++){
            pre[i] = prod;
            prod = nums[i] * prod;
        }

        prod = 1;
        for(int i = nums.length - 1; i>=0; i--){
            suf[i] = prod;
            prod = nums[i] * prod;
        }

        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = suf[i] * pre[i];
        }

        return ans;
    }
}  
