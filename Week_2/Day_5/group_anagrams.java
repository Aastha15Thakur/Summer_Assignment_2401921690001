class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            int[] freq = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                freq[curr - 'a']++;
            }            
            String key = "";
            for (int count : freq) {
                key += count + "#";
            }           
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }            
            map.get(key).add(str);
        }        
        return new ArrayList<>(map.values());
    }
}