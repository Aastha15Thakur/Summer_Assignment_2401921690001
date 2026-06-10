class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < t.length()) {
            char currentCharInT = t.charAt(i);
            char currentCharInS = s.charAt(j);

            if (currentCharInT == currentCharInS) {
                j++;
            }

            if (j == s.length()) {
                return true;
            }

            i++;
        }

        return s.length() == 0;
    }
}