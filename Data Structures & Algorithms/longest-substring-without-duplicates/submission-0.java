class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int freq[] = new int[256];
        int max = 0;
        while(r<s.length()){
            if(freq[s.charAt(r)]==0){
                freq[s.charAt(r)]++;
                r++;
                max = Math.max(max, r-l);
            } else {
                while(freq[s.charAt(r)]>0){
                    freq[s.charAt(l)]--;
                    l++;
                }
                max = Math.max(max,r-l);
            }
        }

        return max;
    }
}
