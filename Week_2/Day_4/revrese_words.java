class Solution {
    public String reverseWords(String s) {
        String result = ;
        String word = ;

        for (int i = 0; i  s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word = word + s.charAt(i);
            } 
            else {
                result = result + reverse(word);
                result = result +  ;
                word = ;
            }
        }
        result = result + reverse(word);
        return result;
    }

    public String reverse(String str) {

        if (str.length() == 0) {
            return ;
        }

        return str.charAt(str.length() - 1) + 
               reverse(str.substring(0, str.length() - 1));
    }
}