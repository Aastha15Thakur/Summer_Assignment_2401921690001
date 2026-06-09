class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> Map = new HashMap<>();
        int start=0;
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(Map.containsKey(curr)){
                start = Math.max(start, Map.get(curr) + 1);
            }
            Map.put(curr, i);
            maxlength = Math.max(maxlength, i - start + 1);
        }
        return maxlength;   
    }
}