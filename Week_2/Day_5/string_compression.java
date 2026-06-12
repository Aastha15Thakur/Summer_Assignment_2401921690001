class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } 
            else {
                chars[index] = chars[i];
                index++;

                if (count > 1) {
                    String num = String.valueOf(count);

                    for (int j = 0; j < num.length(); j++) {
                        chars[index] = num.charAt(j);
                        index++;
                    }
                }
                count = 1;
            }
        }
        return index;
    }
}