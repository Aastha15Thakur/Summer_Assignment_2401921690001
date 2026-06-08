class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            if (count.containsKey(ch)) {
                int value = count.get(ch);
                count.put(ch, value + 1);
            } else {
                count.put(ch, 1);
            }
        }

        for (char ch : ransomNote.toCharArray()) {
            if (count.containsKey(ch)) {
                int value = count.get(ch);

                if (value > 0) {
                    count.put(ch, value - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}