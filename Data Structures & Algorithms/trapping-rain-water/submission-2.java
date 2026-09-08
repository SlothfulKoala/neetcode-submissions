class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int water = 0;
        int maxL = height[0];
        int maxR = height[height.length-1];

        int l = 0;
        int r = height.length-1;
        while(l<r){
            if(maxL<=maxR){
                l++;
                if(maxL-height[l]>0){
                    water+=maxL-height[l];
                }
                maxL = Math.max(maxL, height[l]);
            } else {
                r--;
                if(maxR-height[r]>0){
                    water+=maxR-height[r];
                }
                maxR = Math.max(maxR, height[r]);
            }
        }

        return water;
    }
}
