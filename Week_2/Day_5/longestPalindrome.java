class Solution {

    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            String left = expand(s, i, i);
            String right = expand(s, i, i + 1);

            if (left.length() > ans.length()) {
                ans = left;
            }
            if (right.length() > ans.length()) {
                ans = right;
            }
        }
        return ans;
    }

    public String expand(String s, int i, int j) {
        while (i >= 0 && j < s.length()
                && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return s.substring(i + 1, j);
    }
}