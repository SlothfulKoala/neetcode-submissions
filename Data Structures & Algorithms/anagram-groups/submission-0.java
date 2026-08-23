class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();

        for(String s : strs){
            int freq[] = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq);
            if(m.containsKey(key)){
                m.get(key).add(s);
            } else {
                m.put(key,new ArrayList<String>());
                m.get(key).add(s);
            }
        }

        return new ArrayList<>(m.values());
    }
}
