class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        int l = 0; 
        int r = 0;
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            l = i+1;
            r = nums.length-1;
            while(l<r){
                if(r+1<nums.length && nums[r]==nums[r+1]){
                    r--;
                    continue;
                }

                int sum = nums[l] + nums[r] + nums[i];

                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[r]);
                    list.add(nums[i]);
                    sol.add(list);
                    l++;
                    r--;
                } else if(sum>0){
                    r--;
                } else {
                    l++;
                }
            }
        }

        return sol;
    }
}
